package com.lightningkite.mppexample

import kotlin.reflect.KClass

interface RelativeNavigation<CONTEXT> {
    val root: RelativeNavigation<CONTEXT>
    val containing: RelativeNavigation<CONTEXT>?
    fun sub(): RelativeNavigation<CONTEXT>
    val dialog: RelativeNavigation<CONTEXT>

    val current: InstantChangeable<Screen<CONTEXT>>

    fun push(screen: Screen<CONTEXT>)
    fun replace(screen: Screen<CONTEXT>)
    fun reset(screen: Screen<CONTEXT>)
    fun pop(): Boolean
    fun clear()
}

typealias Stack<C> = InstantChangeable<List<Screen<C>>>

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

data class Link(val on: RelativeNavigation<*>)

object ScreenRegistry {
    class Handler<VG: Any>(
        val type: KClass<VG>,
        val name: String,
        val argCount: Int,
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
    fun parse(urlish: Urlish): Any? {
        @Suppress("UNCHECKED_CAST")
        return (_handlers2[urlish.name] as? Handler<Any>)?.let {
            it.parse(urlish.arguments)
        }
    }
    fun argumentCount(name: String): Int? = _handlers2[name]?.argCount

    fun <T : Any> register(
        type: KClass<T>,
        name: String,
        argCount: Int,
        parse: (arguments: List<String>) -> T,
        render: (T) -> List<String>
    ) {
        val h = Handler(type, name, argCount, parse, render)
        _handlers[type] = h
        _handlers2[name] = h
    }
}

/**
 *
 * Push/Pop/Replace/Reset/Clear
 * Observe stack
 * Works without actually rendering the view, ideally
 *
 * ON WEB:
 * Update the URL bar
 * Render links properly as AHREF ideally
 *
 */