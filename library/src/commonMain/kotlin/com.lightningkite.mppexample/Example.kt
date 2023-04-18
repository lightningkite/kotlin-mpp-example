package com.lightningkite.mppexample

import kotlinx.serialization.Serializable

expect val codePlatform: String
expect val uiPlatform: String

expect interface PlatformView {}
data class Color(val r: UByte, val g: UByte, val b: UByte, val a: UByte = 255.toUByte()) {
    companion object {
        val BLACK = Color(0.toUByte(), 0.toUByte(), 0.toUByte())
        val RED = Color(255.toUByte(), 0.toUByte(), 0.toUByte())
    }
}

expect fun PlatformView.setBackgroundColor(color: Color)

expect fun fireAndForgetLaunch(action: suspend () -> Unit)