package com.lightningkite.mppexample

import android.view.View
import android.widget.TextView
import kotlin.reflect.KFunction1
import kotlin.reflect.KMutableProperty0

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

fun TextView.test() {
    val x: Readable<String> = state("Test String")
    val y: Readable<String> = state("Test String")
    ::textString { x.value + y.value }
}

interface SomeScope {
    operator fun <T> Readable<T>.invoke(): T
    val <T> Readable<T>.value: T
}
interface Readable<T> {
    fun read(context: SomeScope): T
}
fun <T> state(init: T): Readable<T> = TODO()

var TextView.textString: String
    get() = this.text.toString()
    set(value) { this.setText(value) }

operator fun <T> KFunction1<T, Unit>.invoke(actionToCalculate: SomeScope.()->T) {
    actionToCalculate()
}
operator fun <T> KMutableProperty0<T>.invoke(actionToCalculate: SomeScope.()->T) {
    actionToCalculate()
}