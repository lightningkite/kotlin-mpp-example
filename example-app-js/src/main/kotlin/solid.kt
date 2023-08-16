package com.lightningkite.mppexampleapp

import kotlin.reflect.KFunction1
import kotlin.reflect.KMutableProperty0

interface
interface DependencyGatherer {
    operator fun <T> Readable<T>.invoke(): T
    val <T> Readable<T>.value: T
}
interface Readable<T> {
    fun read(context: DependencyGatherer): T
}

operator fun <T> KFunction1<T, *>.invoke(actionToCalculate: DependencyGatherer.()->T) {
    actionToCalculate()
}
operator fun <T> KMutableProperty0<T>.invoke(actionToCalculate: DependencyGatherer.()->T) {
    actionToCalculate()
}
