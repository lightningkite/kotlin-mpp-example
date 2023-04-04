package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

val platform: String = "$codePlatform $uiPlatform"

fun setViewToRed(view: PlatformView) = view.setBackgroundColor(Color.RED)
