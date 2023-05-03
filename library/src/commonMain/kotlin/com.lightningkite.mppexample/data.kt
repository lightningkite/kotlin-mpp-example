package com.lightningkite.mppexample

import kotlin.jvm.JvmInline

sealed interface DataState<out T> {
    fun <B> flatMap(transform: (T)->DataState<B>): DataState<B>
    fun <B> map(transform: (T)->B): DataState<B>
    @JvmInline
    value class Ready<T>(val value: T): DataState<T> {
        override fun <B> flatMap(transform: (T) -> DataState<B>): DataState<B> = transform(value)
        override fun <B> map(transform: (T) -> B): DataState<B> = Ready(transform(value))
    }
    @JvmInline
    value class LoadingWithExample<T>(val example: T): DataState<T> {
        override fun <B> flatMap(transform: (T) -> DataState<B>): DataState<B> = transform(example)
        override fun <B> map(transform: (T) -> B): DataState<B> = Ready(transform(example))
    }
    object Loading: DataState<Nothing> {
        override fun <B> flatMap(transform: (Nothing) -> DataState<B>): DataState<B> = this
        override fun <B> map(transform: (Nothing) -> B): DataState<B> = this
    }
    @JvmInline
    value class Error(val exception: Exception): DataState<Nothing> {
        override fun <B> flatMap(transform: (Nothing) -> DataState<B>): DataState<B> = this
        override fun <B> map(transform: (Nothing) -> B): DataState<B> = this
    }
}

interface Changing<out T> {
    val state: DataState<T>
    fun subscribe(action: (DataState<T>) -> Unit): () -> Unit
}
interface Changeable<T>: Changing<T> {
    override var state: DataState<T>
}

interface InstantChanging<T> : Changing<T> {
    val value: T
}
interface InstantChangeable<T> : Changeable<T> {
    var value: T
}

class Constant<T>(override val value: T): InstantChanging<T> {
    override val state: DataState<T> = DataState.Ready(value)
    override fun subscribe(action: (DataState<T>) -> Unit): () -> Unit = {}
}
class Property<T>(value: T): InstantChangeable<T> {
    private val listeners = HashSet<(DataState<T>)->Unit>()
    private var updating: Boolean = false
    override var value: T = value
        set(value) {
            if (updating) throw ConcurrentModificationException()
            updating = true
            field = value
            val state = DataState.Ready(value)
            listeners.forEach { it(state) }
            updating = false
        }
    override var state: DataState<T>
        get() = DataState.Ready(value)
        set(value) {
            if(value !is DataState.Ready) throw IllegalArgumentException()
            this.value = value.value
        }
    override fun subscribe(action: (DataState<T>) -> Unit): () -> Unit {
        listeners.add(action)
        return { listeners.remove(action) }
    }
}
class LateProperty<T>(state: DataState<T> = DataState.Loading): Changeable<T> {
    private val listeners = HashSet<(DataState<T>)->Unit>()
    private var updating: Boolean = false
    override var state: DataState<T> = state
        set(value) {
            if (updating) throw ConcurrentModificationException()
            updating = true
            field = value
            listeners.forEach { it(value) }
            updating = false
        }
    override fun subscribe(action: (DataState<T>) -> Unit): () -> Unit {
        listeners.add(action)
        return { listeners.remove(action) }
    }
}
fun <T> suspendData(action: suspend ()->T): Changing<T> {
    val data = LateProperty<T>(DataState.Loading)
    fireAndForgetLaunch {
        try {
            data.state = DataState.Ready(action())
        } catch(e: Exception) {
            data.state = DataState.Error(e)
        }
    }
    return data
}
interface DataScope<T> {
    suspend fun yield(item: T)
    suspend fun error(exception: Exception)
    suspend fun loading()
    suspend fun yieldAll(iterator: Iterator<T>) = iterator.forEach { yield(it) }
}
fun <T> generateData(action: suspend (scope: DataScope<T>)->Unit): Changing<T> {
    val data = LateProperty<T>(DataState.Loading)
    fireAndForgetLaunch {
        try {
            action(object: DataScope<T> {
                override suspend fun yield(item: T) {
                    data.state = DataState.Ready(item)
                }

                override suspend fun error(exception: Exception) {
                    data.state = DataState.Error(exception)
                }

                override suspend fun loading() {
                    data.state = DataState.Loading
                }
            })
        } catch(e: Exception) {
            data.state = DataState.Error(e)
        }
    }
    return data
}

fun <T, B> Changing<T>.view(transform: (T) -> B): Changing<B> = object : Changing<B> {
    override val state: DataState<B> get() = this@view.state.map(transform)
    override fun subscribe(action: (DataState<B>) -> Unit): () -> Unit = this@view.subscribe { action(it.map(transform)) }
}

fun <T, B> Changing<T>.viewData(transform: (T) -> Changing<B>): Changing<B> = object : Changing<B> {
    override val state: DataState<B> get() = this@viewData.state.flatMap { transform(it).state }
    override fun subscribe(action: (DataState<B>) -> Unit): () -> Unit {
        var sub: () -> Unit = when(val state = this@viewData.state) {
            is DataState.Ready -> state.value.let(transform).subscribe(action)
            else -> { {} }
        }
        val base = this@viewData.subscribe {
            sub()
            sub = when(val state = it) {
                is DataState.Ready -> state.value.let(transform).subscribe(action)
                else -> { {} }
            }
            action(state)
        }
        return {
            sub()
            base()
        }
    }
}

fun <T, B> Changing<T>.viewSuspend(transform: suspend (T) -> B): Changing<B> = viewData { it: T -> suspendData { transform(it) } }

fun <T, B> Changeable<T>.view(transform: (T) -> B, reverse: (B) -> T): Changeable<B> = object : Changeable<B> {
    override var state: DataState<B>
        get() = this@view.state.map(transform)
        set(value) { this@view.state = value.map(reverse) }
    override fun subscribe(action: (DataState<B>) -> Unit): () -> Unit = this@view.subscribe { action(it.map(transform)) }
}

fun <T, B> Changeable<T>.viewData(transform: (T) -> Changeable<B>): Changeable<B> = object : Changeable<B>, Changing<B> by viewData(transform) {
    override var state: DataState<B>
        get() = this@viewData.state.flatMap { transform(it).state }
        set(value) {
            when(val state = this@viewData.state) {
                is DataState.Ready -> state.value.let(transform).state = value
                else -> { {} }
            }
        }
}

fun <T> Changing<T>.withWrite(action: (T)->Unit): Changeable<T> = object: Changeable<T>, Changing<T> by this {
    override var state: DataState<T>
        get() = this@withWrite.state
        set(value) {
            if(value is DataState.Ready) action(value.value)
        }
}

fun <T> InstantChanging<T>.withWrite(action: (T)->Unit): InstantChangeable<T> = object: InstantChangeable<T>, InstantChanging<T> by this {
    override var value: T
        get() = this@withWrite.value
        set(value) { action(value) }

    override var state: DataState<T>
        get() = this@withWrite.state
        set(value) {
            if(value is DataState.Ready) action(value.value)
        }
}

// TODO: Share
