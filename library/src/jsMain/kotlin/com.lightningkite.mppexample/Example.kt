package com.lightningkite.mppexample

import kotlinx.browser.document
import org.w3c.dom.*

actual class Context()

actual abstract class View actual constructor(actual val context: Context, ): ListeningLifecycle {
    abstract val element: HTMLElement
    protected fun configure() {
        element.asDynamic().controller = this
    }
    companion object {
        init {
            MutationObserver { list, ob ->
                list.forEach {
                    it.removedNodes.asList().forEach {
                        (it.asDynamic().controller as? View)?.let {
                            it.removeList.forEach { it() }
                            it.removeList.clear()
                        }
                    }
                }
            }.observe(document.body!!, MutationObserverInit(
                childList = true,
                subtree = true,
            ))
        }
    }
    val removeList = ArrayList<() -> Unit>()
    override fun onRemove(action: () -> Unit) {
        removeList.add(action)
    }
}

actual class SimpleLabel actual constructor(context: Context, ): View(context) {
    override val element: HTMLParagraphElement = document.createElement("p") as HTMLParagraphElement
    init { configure() }
    actual var text: String
        get() = element.textContent ?: ""
        set(value) {
            element.textContent = value
        }
}
actual class Column actual constructor(context: Context, vararg views: View): View(context) {
    override val element: HTMLDivElement = document.createElement("div") as HTMLDivElement
    init {
        configure()
        views.forEach { element.appendChild(it.element) }
    }
}

