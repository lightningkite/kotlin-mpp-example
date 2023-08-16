package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.BasicHtmlViewFactory
import com.lightningkite.mppexample.HtmlView
import com.lightningkite.mppexample.Property
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLParagraphElement

fun main() {
    val counter = Property(0)
    window.setInterval({
        counter.current++
        println(counter.current)
    }, 1000)
    document.body!!.appendChild((BasicHtmlViewFactory().myView(counter) as HtmlView<*>).element)
}
