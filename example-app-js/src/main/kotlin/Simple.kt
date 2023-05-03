package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*
import kotlinx.browser.document
import org.w3c.dom.HTMLParagraphElement

fun main() {
    DemoScreen().render(AppContext(
        renderer = BasicHtmlRenderer(DirectHtmlFactory().apply { push(document.body) }),
        navigation = object: RelativeNavigation<AppContext> {
            override val root: RelativeNavigation<AppContext>
                get() = TODO("Not yet implemented")
            override val containing: RelativeNavigation<AppContext>?
                get() = TODO("Not yet implemented")

            override fun sub(): RelativeNavigation<AppContext> {
                TODO("Not yet implemented")
            }

            override val dialog: RelativeNavigation<AppContext>
                get() = TODO("Not yet implemented")
            override val current: Changing<Screen<AppContext>>
                get() = TODO("Not yet implemented")

            override fun pop(): Boolean {
                TODO("Not yet implemented")
            }

            override fun clear() {
                TODO("Not yet implemented")
            }

            override fun reset(screen: Screen<AppContext>) {
                TODO("Not yet implemented")
            }

            override fun replace(screen: Screen<AppContext>) {
                TODO("Not yet implemented")
            }

            override fun push(screen: Screen<AppContext>) {
                TODO("Not yet implemented")
            }

        }
    ))

}
