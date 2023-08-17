package com.lightningkite.mppexample

expect class ViewContext {
    val onRemove: OnRemoveHandler
}

expect open class View
typealias OnRemoveHandler = (onRemove: ()->Unit)->Unit
expect val View.onRemove: OnRemoveHandler

expect fun ViewContext.simpleLabel(setup: SimpleLabel.()->Unit = {}): SimpleLabel
expect class SimpleLabel: View
expect var SimpleLabel.text: String

expect fun ViewContext.column(vararg views: View, setup: Column.()->Unit = {}): Column
expect class Column: View

/*

OPTIONS

expect/actual views directly
    requires semi-matching interfaces or overrides
    expect/actual all ListeningLifecycle functions
    speedy
wrap all views in objects
    overhead
    platform unspecific - can unit test easier, probably
    easy listeninglifecycle

direct creation functions
    no interfaces to manage
normal factory to create
    can introduce different contexts where "button" generates a different view circumstantially
interface reference + factory
    no guarantees everything is set up - could get runtime crashes because custom view is not available

*/