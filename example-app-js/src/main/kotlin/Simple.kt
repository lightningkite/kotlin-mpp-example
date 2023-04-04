package com.lightningkite.mppexampleapp

import kotlinx.browser.document
import org.w3c.dom.HTMLParagraphElement

fun main() {
    (document.createElement("p") as HTMLParagraphElement).apply {
        this.innerText = platform
        setViewToRed(this)
    }.also { document.body!!.appendChild(it) }
}
