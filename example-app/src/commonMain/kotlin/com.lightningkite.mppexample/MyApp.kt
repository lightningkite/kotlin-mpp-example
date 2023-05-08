package com.lightningkite.mppexampleapp

import com.lightningkite.mppexample.*

class DemoScreen: Screen<AppContext> {

    val currentValue = Property(1)
    val currentValue2 = Property(1)
    val textValue = Property("Hello world!")
    val boolValue = Property(false)

    override fun render(context: AppContext) {
        with(context.renderer) {
            col {
                incrementor(currentValue)
                incrementor(currentValue2)

                h3("header")
                header(1, textValue)

                h3("body")
                body(textValue)

                h3("hint")
                hint(textValue)

                h3("button")
                button(textValue, action = {println("HI")})

                h3("boolean")
                boolean(boolValue, "boolean")

                h3("shown")
                shown(boolValue) {
                    h3("shown")
                }

                h3("date")
                date(Property(null), "date")

                h3("time")
                time(Property(null), "time")

                h3("dateTime")
                dateTime(Property(null), "dateTime")

                h3("field")
                field(textValue, "field", keyboardHints = KeyboardHints.title)

                h3("textArea")
                textArea(textValue, "textArea", keyboardHints = KeyboardHints.paragraph)

                h3("password")
                password(textValue, "field", keyboardHints = KeyboardHints.password)

                h3("select")
                select(currentValue, listOf(1, 2, 3), "select")

                h3("row")
                row { body("A"); weight(1f) { body("B") }; body("C") }

                h3("col")
                col { body("A"); weight(1f) { body("B") }; body("C") }

                h3("overlap")
                overlap { body("A"); frame(Align.End, Align.Start, 8) { body("B") }; body("C") }

//                h3("scrolls")
//                scrolls()

//                h3("alpha")
//                alpha()
//
//                h3("card")
//                card()
//
//                h3("space")
//                space()
//
//                h3("image")
//                image()
//
//                h3("circleImage")
//                circleImage()
//
//                h3("pages")
//                pages()
//
//                h3("sectionNavigation")
//                sectionNavigation()
//
//                h3("stackControls")
//                stackControls()
//
//                h3("stackView")
//                stackView()
//
//                h3("list")
//                list()
//
//                h3("list")
//                list()
//
//                h3("expandingContent")
//                expandingContent()
//
//                h3("onClick")
//                onClick()
//
//                h3("lazy")
//                lazy()
            }
        }
    }
}

fun SemanticRenderer.incrementor(currentValue: Property<Int>) {
    col {
        h1("Hello world!")
        body(currentValue.view { it.toString() })
        button("Increment") {
            currentValue.value++
        }
    }
}