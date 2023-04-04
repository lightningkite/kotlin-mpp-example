package com.lightningkite.mppexample

import org.w3c.dom.Element

actual val uiPlatform: String get() = "Either a server or Swing Desktop... ugh..."

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias PlatformView = Element

actual fun PlatformView.setBackgroundColor(color: Color) {
}