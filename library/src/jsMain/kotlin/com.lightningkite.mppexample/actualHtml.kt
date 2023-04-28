package com.lightningkite.mppexample

import kotlinx.browser.document
import kotlinx.dom.appendText
import org.w3c.dom.CharacterData
import org.w3c.dom.HTMLMediaElement
import org.w3c.dom.get

actual typealias CSSStyleDeclaration = org.w3c.dom.css.CSSStyleDeclaration
actual typealias Node = org.w3c.dom.Node
actual typealias CharacterData = org.w3c.dom.CharacterData
actual typealias Text = org.w3c.dom.Text
actual typealias Element = org.w3c.dom.Element
actual typealias HTMLElement = org.w3c.dom.HTMLElement
actual typealias HTMLAnchorElement = org.w3c.dom.HTMLAnchorElement
actual typealias HTMLAppletElement = org.w3c.dom.HTMLAppletElement
actual typealias HTMLAreaElement = org.w3c.dom.HTMLAreaElement
actual typealias HTMLMediaElement = org.w3c.dom.HTMLMediaElement
actual typealias HTMLAudioElement = org.w3c.dom.HTMLAudioElement
actual typealias HTMLBaseElement = org.w3c.dom.HTMLBaseElement
actual typealias HTMLQuoteElement = org.w3c.dom.HTMLQuoteElement
actual typealias HTMLBodyElement = org.w3c.dom.HTMLBodyElement
actual typealias HTMLButtonElement = org.w3c.dom.HTMLButtonElement
actual typealias HTMLCanvasElement = org.w3c.dom.HTMLCanvasElement
actual typealias HTMLTableCaptionElement = org.w3c.dom.HTMLTableCaptionElement
actual typealias HTMLTableColElement = org.w3c.dom.HTMLTableColElement
actual typealias HTMLDataElement = org.w3c.dom.HTMLDataElement
actual typealias HTMLModElement = org.w3c.dom.HTMLModElement
actual typealias HTMLDetailsElement = org.w3c.dom.HTMLDetailsElement
actual typealias HTMLDialogElement = org.w3c.dom.HTMLDialogElement
actual typealias HTMLEmbedElement = org.w3c.dom.HTMLEmbedElement
actual typealias HTMLFieldSetElement = org.w3c.dom.HTMLFieldSetElement
actual typealias HTMLFontElement = org.w3c.dom.HTMLFontElement
actual typealias HTMLFormElement = org.w3c.dom.HTMLFormElement
actual typealias HTMLHRElement = org.w3c.dom.HTMLHRElement
actual typealias HTMLIFrameElement = org.w3c.dom.HTMLIFrameElement
actual typealias HTMLImageElement = org.w3c.dom.HTMLImageElement
actual typealias HTMLInputElement = org.w3c.dom.HTMLInputElement
actual typealias HTMLKeygenElement = org.w3c.dom.HTMLKeygenElement
actual typealias HTMLLabelElement = org.w3c.dom.HTMLLabelElement
actual typealias HTMLLIElement = org.w3c.dom.HTMLLIElement
actual typealias HTMLLinkElement = org.w3c.dom.HTMLLinkElement
actual typealias HTMLMapElement = org.w3c.dom.HTMLMapElement
actual typealias HTMLMarqueeElement = org.w3c.dom.HTMLMarqueeElement
actual typealias HTMLMenuElement = org.w3c.dom.HTMLMenuElement
actual typealias HTMLMetaElement = org.w3c.dom.HTMLMetaElement
actual typealias HTMLMeterElement = org.w3c.dom.HTMLMeterElement
actual typealias HTMLObjectElement = org.w3c.dom.HTMLObjectElement
actual typealias HTMLOListElement = org.w3c.dom.HTMLOListElement
actual typealias HTMLOptGroupElement = org.w3c.dom.HTMLOptGroupElement
actual typealias HTMLOptionElement = org.w3c.dom.HTMLOptionElement
actual typealias HTMLOutputElement = org.w3c.dom.HTMLOutputElement
actual typealias HTMLParamElement = org.w3c.dom.HTMLParamElement
actual typealias HTMLProgressElement = org.w3c.dom.HTMLProgressElement
actual typealias HTMLScriptElement = org.w3c.dom.HTMLScriptElement
actual typealias HTMLSelectElement = org.w3c.dom.HTMLSelectElement
actual typealias HTMLSourceElement = org.w3c.dom.HTMLSourceElement
actual typealias HTMLStyleElement = org.w3c.dom.HTMLStyleElement
actual typealias HTMLTableElement = org.w3c.dom.HTMLTableElement
actual typealias HTMLTableSectionElement = org.w3c.dom.HTMLTableSectionElement
actual typealias HTMLTableCellElement = org.w3c.dom.HTMLTableCellElement
actual typealias HTMLTextAreaElement = org.w3c.dom.HTMLTextAreaElement
actual typealias HTMLTimeElement = org.w3c.dom.HTMLTimeElement
actual typealias HTMLTableRowElement = org.w3c.dom.HTMLTableRowElement
actual typealias HTMLTrackElement = org.w3c.dom.HTMLTrackElement
actual typealias HTMLVideoElement = org.w3c.dom.HTMLVideoElement

class DirectHtmlFactory: HtmlFactory {
    val stack = ArrayList<HTMLElement>()
    override fun <T : HTMLElement> element(tagName: String): T {
        @Suppress("UNCHECKED_CAST")
        return document.createElement(tagName).let { it as HTMLElement }.also {
            stack.lastOrNull()?.appendChild(it)
            stack.add(it)
        } as T
    }

    override fun text(text: String) {
        stack.lastOrNull()?.let {
            it.appendChild(it.ownerDocument!!.createTextNode(text))
        }
    }

    override fun exitElement() { stack.removeLast() }
}

class MergeHtmlFactory(val mergeWith: HTMLElement): HtmlFactory {
    val stack = ArrayList<HTMLElement>()
    val childNumber = ArrayList<Int>()
    @Suppress("UNCHECKED_CAST")
    override fun <T : HTMLElement> element(tagName: String): T {
        val currentElement = stack.lastOrNull()
        if(currentElement == null) {
            return if(mergeWith.tagName != tagName) {
                document.createElement(tagName).let { it as HTMLElement }.also {
                    stack.add(it)
                    childNumber.add(0)
                } as T
            } else {
                stack.add(mergeWith)
                childNumber.add(0)
                mergeWith as T
            }
        }
        val currentIndex = childNumber.lastOrNull() ?: 0
        val existing = currentElement?.children?.get(currentIndex) as? HTMLElement
        return if(existing == null) {
            document.createElement(tagName).let { it as HTMLElement }.also {
                stack.lastOrNull()?.appendChild(it)
                stack.add(it)
                childNumber.add(0)
            } as T
        } else if(existing.tagName != tagName) {
            document.createElement(tagName).let { it as HTMLElement }.also {
                currentElement?.replaceChild(existing, it)
                childNumber.set(childNumber.lastIndex, currentIndex + 1)
                stack.add(it)
                childNumber.add(0)
            } as T
        } else {
            val it = existing
            childNumber.set(childNumber.lastIndex, currentIndex + 1)
            stack.add(it as HTMLElement)
            childNumber.add(0)
            it as T
        }
    }

    override fun text(text: String) {
        val currentElement = stack.lastOrNull() ?: return
        val currentIndex = childNumber.lastOrNull() ?: 0
        val existing = currentElement?.children?.get(currentIndex) as? Text
        if(existing != null) currentElement.replaceChild(existing, Text(text))
        else currentElement.appendChild(Text(text))
        childNumber.set(childNumber.lastIndex, currentIndex + 1)
    }

    override fun exitElement() {
        stack.removeLast()
        childNumber.removeLast()
    }
}