package com.lightningkite.mppexample

interface View: ListeningLifecycle
interface SimpleLabel: View {
    var text: String
}

interface ViewFactory {
    fun simpleLabel(): SimpleLabel
    fun column(vararg views: View): View
}

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