package com.lightningkite.mppexample

expect class ViewContext {
    val onRemove: OnRemoveHandler
}

expect open class NView
typealias OnRemoveHandler = (onRemove: ()->Unit)->Unit
expect val NView.onRemove: OnRemoveHandler


expect fun ViewContext.simpleLabel(setup: SimpleLabel.()->Unit = {}): Unit
expect class SimpleLabel: NView
expect var SimpleLabel.text: String

expect fun ViewContext.column(setup: Column.()->Unit = {}): Unit
expect class Column: NView

expect fun ViewContext.padding(): ViewWrapper