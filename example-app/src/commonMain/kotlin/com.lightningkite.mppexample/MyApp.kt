package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

fun ViewContext.myView(counter: Readable<Int>): NView {
    val prop = Property(1)
    return column(
        simpleLabel {
            text = "Hi!  Welcome! ${counter.latest}"
        },
        simpleLabel {
            ::text { "Counter value: ${counter.value}" }
        },
        simpleLabel {
            ::text { "Counter value plus one: ${counter.value + prop.value}" }
        },
        simpleLabel {
            rerunScope { text = "Counter value plus one: ${counter.value + prop.value}" }
        },
    )
}


fun ViewContext.myView2(counter: Readable<Int>): NView {
    val prop = Property(1)
    return column {
        simpleLabel {
            text = "Hi!  Welcome! ${counter.latest}"
        }
        simpleLabel {
            ::text { "Counter value: ${counter.value}" }
        }
        simpleLabel {
            ::text { "Counter value plus one: ${counter.value + prop.value}" }
        }
        simpleLabel {
            rerunScope { text = "Counter value plus one: ${counter.value + prop.value}" }
        }
    }
}
