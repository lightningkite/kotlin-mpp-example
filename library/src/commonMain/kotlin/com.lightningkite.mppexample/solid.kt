package com.lightningkite.mppexample

import kotlin.native.concurrent.ThreadLocal
import kotlin.reflect.KMutableProperty0

/**
 * Keeps track of the current builder's lifecycle to add listeners to.
 * TODO: Remove this in favor of context receivers when they are available
 */
@ThreadLocal
object ListeningLifecycleStack {
    val stack = ArrayList<OnRemoveHandler>()
    fun onRemove(action: () -> Unit) = stack.last()(action)
    inline fun useIn(noinline handler: OnRemoveHandler, action: () -> Unit) {
        stack.add(handler)
        try {
            action()
        } finally {
            if (stack.removeLast() != handler)
                throw ConcurrentModificationException("Multiple threads have been attempting to instantiate views at the same time.")
        }
    }
}

operator fun <T, IGNORED> ((T) -> IGNORED).invoke(actionToCalculate: RerunScope.() -> T) = rerunScope {
    this@invoke(actionToCalculate(this))
}

operator fun <T> KMutableProperty0<T>.invoke(actionToCalculate: RerunScope.() -> T) = rerunScope {
    this@invoke.set(actionToCalculate(this))
}

fun rerunScope(action: RerunScope.() -> Unit) {
    val dm = RerunScope(action)
    ListeningLifecycleStack.onRemove { dm.clear() }
}

class RerunScope(val action: RerunScope.() -> Unit) {
    private val removers: HashMap<Listenable, () -> Unit> = HashMap()
    private val latestPass: HashSet<Listenable> = HashSet()
    fun rerunOn(listenable: Listenable) {
        latestPass.add(listenable)
    }

    private operator fun invoke() {
        latestPass.clear()
        try {
            action()
        } finally {
            // Remove listeners we no longer depend on
            for (entry in removers.entries.toList()) {
                if (entry.key !in latestPass) {
                    entry.value()
                }
            }
            // Add listeners that are new
            for (new in latestPass) {
                if (!removers.containsKey(new)) {
                    removers[new] = new.addListener { this() }
                }
            }
        }
    }

    val <T> Readable<T>.value: T
        get() {
            rerunOn(this)
            return latest
        }
    var <T> Writable<T>.value: T
        get() = (this as Readable<T>).value
        set(value) {
            this.latest = value
        }

    fun clear() {
        removers.forEach { it.value() }
        removers.clear()
    }

    init {
        this()
    }
}

interface Listenable {
    fun addListener(listener: () -> Unit): () -> Unit
}

interface Readable<T> : Listenable {
    val latest: T
}

interface Writable<T> : Readable<T> {
    override var latest: T
}

class Property<T>(startValue: T) : Writable<T> {
    val listeners = HashSet<() -> Unit>()
    override var latest: T = startValue
        set(value) {
            field = value
            listeners.toList().forEach { it() }
        }

    override fun addListener(listener: () -> Unit): () -> Unit {
        listeners.add(listener)
        return {
            listeners.remove(listener)
        }
    }
}
