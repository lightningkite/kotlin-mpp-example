package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.Context
import com.lightningkite.mppexample.Property
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    val counter = Property(0)
    window.setInterval({
        counter.latest++
        println(counter.latest)
    }, 1000)
    document.body!!.appendChild(Dsl(Context()).myView(counter).element)
}
