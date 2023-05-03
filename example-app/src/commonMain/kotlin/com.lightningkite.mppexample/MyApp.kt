package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

class DemoScreen: Screen<AppContext> {
    val currentValue = Property(1)
    override fun render(context: AppContext) {
        with(context.renderer) {
            col {
                h1("Hello world!")
                body(currentValue.view { it.toString() })
                button("Increment") {
                    currentValue.value++
                }
            }
        }
    }
}