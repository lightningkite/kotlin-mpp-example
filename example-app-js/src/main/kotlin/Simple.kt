package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLParagraphElement

fun main() {
    val counter = Property(0)
    window.setInterval({
        counter.latest++
        println(counter.latest)
    }, 1000)
    val context = ViewContext()
    document.body!!.appendChild(context.myView(counter))

    document.body!!.appendChild(context.element<HTMLParagraphElement>("p") {
        ::textContent { counter.value.toString() }
    })
}
