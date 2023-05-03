package com.lightningkite.mppexample

import kotlin.reflect.KClass

interface RelativeNavigation<CONTEXT> {
    val root: RelativeNavigation<CONTEXT>
    val containing: RelativeNavigation<CONTEXT>?
    fun sub(): RelativeNavigation<CONTEXT>
    val dialog: RelativeNavigation<CONTEXT>

    val current: Changing<Screen<CONTEXT>>

    fun push(screen: Screen<CONTEXT>)
    fun replace(screen: Screen<CONTEXT>)
    fun reset(screen: Screen<CONTEXT>)
    fun pop(): Boolean
    fun clear()
}

class AppContext(
    val renderer: SemanticRenderer,
    val navigation: RelativeNavigation<AppContext>,
)

interface ViewGenerator<CONTEXT> {
    fun render(context: CONTEXT)
}

annotation class Autopath
interface Screen<CONTEXT> : ViewGenerator<CONTEXT> {
    val title: Changing<String> get() = Constant("")
    val actions: Changing<List<Action>> get() = Constant(listOf())
}


object ScreenRegistry {
    class Handler<VG: Any>(
        val type: KClass<VG>,
        val name: String,
        val parse: (arguments: List<String>) -> VG,
        val render: (VG) -> List<String>
    )
    data class Urlish(val name: String, val arguments: List<String>)

    private val _handlers = HashMap<KClass<*>, Handler<*>>()
    private val _handlers2 = HashMap<String, Handler<*>>()
    fun render(item: Any): Urlish? {
        @Suppress("UNCHECKED_CAST")
        return (_handlers[item::class] as? Handler<Any>)?.let {
            it.render(item)?.let { args ->
                Urlish(it.name, args)
            }
        }
    }
    fun parse(key: String, arguments: List<String>): Any? {
        @Suppress("UNCHECKED_CAST")
        return (_handlers2[key] as? Handler<Any>)?.let {
            it.parse(arguments)
        }
    }

    fun <T : Any> register(
        type: KClass<T>,
        name: String,
        parse: (arguments: List<String>) -> T,
        render: (T) -> List<String>
    ) {
        val h = Handler(type, name, parse, render)
        _handlers[type] = h
        _handlers2[name] = h
    }
}
