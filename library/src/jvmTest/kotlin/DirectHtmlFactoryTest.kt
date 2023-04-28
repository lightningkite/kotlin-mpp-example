package com.lightningkite.mppexample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DirectHtmlFactoryTest {
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
        fun HtmlFactory.build2(): HTMLElement {
            return html {
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
        }
        val update = MergeHtmlFactory(original).build2()
        val fromScratch = DirectHtmlFactory().build2()
        println(buildString { update.render(this) })
        println(buildString { fromScratch.render(this) })
        assertEquals(buildString { fromScratch.render(this) }, buildString { update.render(this) })
    }
}