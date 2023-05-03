package com.lightningkite.mppexample

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

class BasicHtmlRenderer(val html: HtmlRenderer): SemanticRenderer {
    private val disposalContext = ArrayList<MutableCollection<()->Unit>>()

    private fun (()->Unit).autodispose() {
        disposalContext.lastOrNull()?.add(this)
    }

    override fun header(layer: Int, text: Changing<String>): Unit = with(html) {
        when(layer) {
            1 -> h1 {
                text(text).autodispose()
            }
            2 -> h2 {
                text(text).autodispose()
            }
            3 -> h3 {
                text(text).autodispose()
            }
            4 -> h4 {
                text(text).autodispose()
            }
            5 -> h5 {
                text(text).autodispose()
            }
            6 -> h6 {
                text(text).autodispose()
            }
            else -> h6 {
                text(text).autodispose()
            }
        }
    }

    override fun body(text: Changing<String>): Unit = with(html) {
        p {
            text(text).autodispose()
        }
    }

    override fun hint(text: Changing<String>): Unit = with(html) {
        p {
            text(text).autodispose()
        }
    }

    override fun button(
        text: Changing<String>,
        importance: Importance,
        disabled: Changing<String?>,
        action: suspend () -> Unit
    ): Unit = with(html) {
        button {
            text(text).autodispose()
            addOnClick {
                fireAndForgetLaunch {
                    action()
                }
            }
        }
    }

    override fun boolean(
        value: Changeable<Boolean>,
        label: String,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun date(
        date: Changeable<LocalDate?>,
        hint: String,
        min: Changing<LocalDate?>,
        max: Changing<LocalDate?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun time(
        date: Changeable<LocalTime?>,
        hint: String,
        min: Changing<LocalTime?>,
        max: Changing<LocalTime?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun dateTime(
        date: Changeable<LocalDateTime?>,
        hint: String,
        min: Changing<LocalDateTime?>,
        max: Changing<LocalDateTime?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun field(
        text: Changeable<String>,
        hint: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun textArea(
        text: Changeable<String>,
        hint: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun password(
        text: Changeable<String>,
        hint: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun <T> select(
        selected: Changeable<T>,
        options: Changing<List<T>>,
        toString: (T) -> String,
        validationIssue: Changing<String?>,
        preferRadio: Boolean
    ): Unit = with(html) {
        div { text("TODO") }
    }

    override fun row(content: () -> Unit): Unit = with(html) {
        div {
            className = "row"
            content()
        }
    }

    override fun col(content: () -> Unit): Unit = with(html) {
        div {
            className = "column"
            content()
        }
    }

    override fun weight(number: Float, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun overlap(content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun scrolls(content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun frame(horizontal: Align, vertical: Align, margin: Int, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun shown(shown: Changing<Boolean>, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun alpha(alpha: Changing<Float>, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun card(importance: Importance, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun space(magnitude: Int): Unit = with(html) {
        div { text("TODO") }
    }

    override fun image(source: Changing<ImageWithSetting>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun circleImage(source: Changing<ImageWithSetting>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun pages(pages: List<() -> Unit>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun sectionNavigation(tabs: List<Tab>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun <CONTEXT> stackControls(context: CONTEXT, stack: RelativeNavigation<CONTEXT>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun <CONTEXT> stackView(context: CONTEXT, stack: RelativeNavigation<CONTEXT>): Unit = with(html) {
        div { text("TODO") }
    }

    override fun <T> list(items: Changeable<List<T>>, display: (Changing<T>) -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun <T> list(items: Changeable<List<T>>, identity: (T) -> Long, display: (Changing<T>) -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun expandingContent(expanded: Changeable<Boolean>, content: () -> Unit): Unit = with(html) {
        div { text("TODO") }
    }

    override fun onClick(action: () -> Unit, content: () -> Unit): Unit = with(html) {
        content()
        lastCompleted?.addOnClick(action)
    }

    override fun lazy(view: Changing<() -> Unit>): Unit = with(html) {
        div { text("TODO") }
    }

}