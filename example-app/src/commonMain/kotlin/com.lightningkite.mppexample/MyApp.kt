package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

fun ViewFactory.myView(counter: Readable<Int>): View = column(
    simpleLabel().apply {
        text = "Hi!  Welcome! ${counter.current}"
    },
    simpleLabel().apply {
        ::text { "Counter value: ${counter.value}" }
    },
    simpleLabel().apply {
        ::text { "Counter value plus one: ${counter.value + 1}" }
    },
)