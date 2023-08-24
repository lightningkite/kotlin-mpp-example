package com.lightningkite.mppexample

import kotlinx.browser.document
import org.w3c.dom.css.CSSStyleSheet
import org.w3c.dom.css.get

actual typealias Dimension = Double

actual val DimensionZero get() = 0.0

actual typealias Font = String

actual val systemDefaultFont: Font get() = "Helvetica"

private fun addRule(str: String) =
    (document.styleSheets.get(0) as CSSStyleSheet).let { it.insertRule(str, it.cssRules.length) }

actual class Drawable(val css: Map<String, String>) {
    constructor(css: String):this(mapOf("&" to css))
}

actual fun Drawable(color: Color) = Drawable(mapOf("&" to "background-color: ${color.toWeb()}"))