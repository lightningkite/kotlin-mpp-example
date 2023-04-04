package com.lightningkite.mppexample

import android.view.View

actual val uiPlatform: String get() = "Android"

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias PlatformView = View

actual fun PlatformView.setBackgroundColor(color: Color) {
    this.setBackgroundColor(
        (color.a.toInt() shl 24) or
        (color.r.toInt() shl 16) or
        (color.g.toInt() shl 8) or
        (color.b.toInt() shl 0)
    )
}