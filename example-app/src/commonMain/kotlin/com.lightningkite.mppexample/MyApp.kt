package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

fun ViewContext.myView(counter: Readable<Int>) {
    val prop = Property(1)
    column {
        simpleLabel {
            text = "Hi!  Welcome! ${counter.latest}"
        }

        simpleLabel {
            ::text { "Counter value: ${counter.value}" }
        } in padding() in padding()

        padding()
        simpleLabel {
            ::text { "Counter value plus one: ${counter.value + prop.value}" }
        }

        simpleLabel {
            rerunScope { text = "Counter value plus one: ${counter.value + prop.value}" }
        }
    }
}