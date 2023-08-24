package com.lightningkite.mppexample

expect class ViewContext {
    val onRemove: OnRemoveHandler
}

expect open class NView
typealias OnRemoveHandler = (onRemove: ()->Unit)->Unit
expect val NView.onRemove: OnRemoveHandler
