package com.lightningkite.mppexample

import kotlin.jvm.JvmInline

@JvmInline
value class UiElement(val any: Any)

interface UiElementFactory {
    fun color(color: Color): UiElement
    fun text()
}

//expect abstract class UiView {}
//expect abstract class Col: UiView {}
//expect fun Col(vararg subviews: UiView): Col

