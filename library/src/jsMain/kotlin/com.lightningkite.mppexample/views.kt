package com.lightningkite.mppexample

import kotlinx.browser.document
import org.w3c.dom.*

actual class ViewContext() {
    val onRemoveList = ArrayList<() -> Unit>()
    actual val onRemove: OnRemoveHandler = {
        onRemoveList.add(it)
    }

    fun close() {
        onRemoveList.forEach { it() }
        onRemoveList.clear()
    }

    inline fun <T : HTMLElement> element(name: String, setup: T.() -> Unit): T {
        return (document.createElement(name) as T).apply {
            ListeningLifecycleStack.useIn(this.onRemove) {
                setup()
            }
        }
    }
}

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias View = HTMLElement

actual val View.onRemove: OnRemoveHandler
    get() {
        return {
            this.removeListeners.add(it)
        }
    }

private val HTMLElement.removeListeners: MutableList<() -> Unit>
    get() = removeListenersMaybe ?: run {
        val newList = ArrayList<() -> Unit>()
        this.asDynamic()[RemoveListeners.symbol] = newList
        newList
    }
private val HTMLElement.removeListenersMaybe: MutableList<() -> Unit>?
    get() = this.asDynamic()[RemoveListeners.symbol] as? MutableList<() -> Unit>

private object RemoveListeners {
    val symbol = js("Symbol('removeListeners')")

    init {
        MutationObserver { list, ob ->
            list.forEach {
                it.removedNodes.asList().forEach {
                    (it as? HTMLElement)?.removeListenersMaybe?.let {
                        it.forEach { it() }
                        it.clear()
                    }
                }
            }
        }.observe(
            document.body!!, MutationObserverInit(
                childList = true,
                subtree = true,
            )
        )
    }
}

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias SimpleLabel = HTMLParagraphElement
actual inline fun ViewContext.simpleLabel(setup: SimpleLabel.() -> Unit): SimpleLabel = element("p", setup)
actual var SimpleLabel.text: String
    get() = this.textContent ?: ""
    set(value) {
        this.textContent = value
    }


@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias Column = HTMLDivElement
actual inline fun ViewContext.column(vararg views: View, setup: Column.() -> Unit): Column = element("div") {
    views.forEach { appendChild(it) }
    setup()
}
