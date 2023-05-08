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

fun ScreenRegistry.url(urls: List<ScreenRegistry.Urlish>, hash: ScreenRegistry.Urlish?): String = buildString {
    for (url in urls) {
        append(url.name)
        append('/')
        for(arg in url.arguments) {
            append(arg)
            append('/')
        }
    }
    hash?.let { url ->
        append("#")
        append(url.name)
        append('/')
        for(arg in url.arguments) {
            append(arg)
            append('/')
        }
    }
}
fun ScreenRegistry.url(string: String): List<ScreenRegistry.Urlish>? {
    val parts = string.substringBefore('?').substringBefore('#').split('/').toMutableList()
    val hash = string.substringAfter('#', "").substringBefore('?').split('/')
    return buildList {
        while(parts.isNotEmpty()) {
            val name = parts.removeAt(0)
            val count = argumentCount(name) ?: return null
            val args = (0 until count).map { parts.removeAt(0) }
            add(ScreenRegistry.Urlish(name, args))
        }
    }
}