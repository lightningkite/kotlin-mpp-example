package com.lightningkite.mppexample

import kotlinx.browser.document
import org.w3c.dom.*

open class HtmlView<Element : HTMLElement>(val element: Element) : View {
    init {
        element.asDynamic().controller = this
    }
    companion object {
        init {
            MutationObserver { list, ob ->
                list.forEach {
                    it.removedNodes.asList().forEach {
                        (it.asDynamic().controller as? HtmlView<*>)?.let {
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

class TextHtmlView(element: HTMLParagraphElement): HtmlView<HTMLParagraphElement>(element), SimpleLabel {
    override var text: String
        get() = element.textContent ?: ""
        set(value) {
            element.textContent = value
        }
}

class BasicHtmlViewFactory : ViewFactory {
    override fun simpleLabel(): SimpleLabel = TextHtmlView(document.createElement("p") as HTMLParagraphElement)
    override fun column(vararg views: View): View = HtmlView(document.createElement("div") as HTMLDivElement).apply {
        for(view in views) {
            element.appendChild((view as HtmlView<*>).element)
        }
    }
}