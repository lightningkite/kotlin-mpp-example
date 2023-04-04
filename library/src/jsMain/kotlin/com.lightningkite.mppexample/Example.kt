package com.lightningkite.mppexample

import org.w3c.dom.HTMLElement

actual val codePlatform: String get() = "JS"
actual val uiPlatform: String get() = "Web"

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias PlatformView = HTMLElement

actual fun PlatformView.setBackgroundColor(color: Color) {
    val webColor = "#${color.r.toString(16).padStart(2, '0')}${color.g.toString(16).padStart(2, '0')}${color.b.toString(16).padStart(2, '0')}"
    println(webColor)
    this.style.backgroundColor = webColor
}