package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

class Dsl(val context: Context)
fun Dsl.simpleLabel(setup: SimpleLabel.()->Unit = {}) = SimpleLabel(context).apply(setup)
fun Dsl.column(vararg views: View, setup: Column.()->Unit = {}) = Column(context, views = views).apply(setup)

fun Dsl.myView(counter: Readable<Int>): View {
    val prop = Property(1)
    return column(
        simpleLabel {
            text = "Hi!  Welcome! ${counter.latest}"
        },
        simpleLabel {
            ::text { "Counter value: ${counter.value}" }
        },
        simpleLabel {
            scope {
                text = "Counter value plus one: ${counter.value + prop.value}"
            }
        },
    )
}
