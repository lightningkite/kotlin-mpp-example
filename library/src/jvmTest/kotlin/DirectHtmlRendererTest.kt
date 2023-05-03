package com.lightningkite.mppexample

import kotlin.test.Test
import kotlin.test.assertEquals

class DirectHtmlRendererTest {
    @Test fun test() {
        val dom = with(DirectHtmlFactory()) {
            html {
                head {
                    title = "Title"
                }
                body {
                    div {
                        h1 {
                            text("Hello world!")
                        }
                        p {
                            text("Welcome to my site.")
                        }
                    }
                }
            }
        }
        println(buildString { dom.render(this) })
    }
    @Test fun merge() {
        val original = with(DirectHtmlFactory()) {
            html {
                head {
                    title = "Title"
                }
                body {
                    div {
                        h1 {
                            text("Hello world!")
                        }
                        p {
                            text("Welcome to my site.")
                        }
                    }
                }
            }
        }
        println(buildString { original.render(this) })
        fun HtmlRenderer.build2() {
                head {
                    title = "Title 2"
                }
                body {
                    div {
                        className = "asdf"
                        h1 {
                            text("Hello everyone!")
                        }
                        h4 {
                            text("Welcome to my site.  I improved it.")
                        }
                        p {
                            text("An extra element")
                        }
                    }
                }
        }
        MergeHtmlFactory().let {
            it.forParent(original) {
                build2()
            }
        }
        val fromScratch = with(DirectHtmlFactory()) {
            html {
                build2()
            }
        }
        println(buildString { original.render(this) })
        println(buildString { fromScratch.render(this) })
        assertEquals(buildString { fromScratch.render(this) }, buildString { original.render(this) })
    }
}