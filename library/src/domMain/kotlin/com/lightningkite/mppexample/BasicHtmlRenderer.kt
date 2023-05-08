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
            className = "hint"
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
        label {
            span {
                text(label)
            }
            input {
                type = "checkbox"
                addOnChange {
                    val s = DataState.Ready(it)
                    if(value.state != s) value.state = s
                }
                value.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.value != checked) checked = it.value
                    }
                }.autodispose()
            }
        }
    }

    override fun date(
        date: Changeable<LocalDate?>,
        label: String,
        min: Changing<LocalDate?>,
        max: Changing<LocalDate?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            input {
                type = "date"
                addOnValue {
                    try {
                        val s = DataState.Ready(LocalDate.parse(it))
                        if(date.state != s) date.state = s
                    } catch(e: IllegalArgumentException) {
                        if(date.state !is DataState.Error) DataState.Error(e)
                    }
                }
                date.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.toString() != value) value = it.toString()
                    }
                }.autodispose()
            }
        }
    }

    override fun time(
        date: Changeable<LocalTime?>,
        label: String,
        min: Changing<LocalTime?>,
        max: Changing<LocalTime?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            input {
                type = "time"
                addOnValue {
                    try {
                        val s = DataState.Ready(LocalTime.parse(it))
                        if(date.state != s) date.state = s
                    } catch(e: IllegalArgumentException) {
                        if(date.state !is DataState.Error) DataState.Error(e)
                    }
                }
                date.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.toString().take("hh:mm".length) != value) {
                            value = it.toString().take("hh:mm".length)
                        }
                    }
                }.autodispose()
            }
        }
    }

    override fun dateTime(
        date: Changeable<LocalDateTime?>,
        label: String,
        min: Changing<LocalDateTime?>,
        max: Changing<LocalDateTime?>,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            input {
                type = "datetime-local"
                addOnValue {
                    try {
                        val s = DataState.Ready(LocalDateTime.parse(it))
                        if(date.state != s) date.state = s
                    } catch(e: IllegalArgumentException) {
                        if(date.state !is DataState.Error) DataState.Error(e)
                    }
                }
                date.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.toString().take("YYYY-MM-DDThh:mm".length) != value) value = it.toString().take("YYYY-MM-DDThh:mm".length)
                    }
                }.autodispose()
            }
        }
    }

    override fun field(
        text: Changeable<String>,
        label: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            input {
                type = "text"
                addOnValue {
                    val s = DataState.Ready(it)
                    try {
                        if(text.state != s) text.state = s
                    } catch(e: IllegalArgumentException) {
                        if(text.state !is DataState.Error) DataState.Error(e)
                    }
                }
                text.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.value != value) value = it.value
                    }
                }.autodispose()
            }
        }
    }

    override fun textArea(
        text: Changeable<String>,
        label: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            textarea {
                addOnValue {
                    val s = DataState.Ready(it)
                    try {
                        if(text.state != s) text.state = s
                    } catch(e: IllegalArgumentException) {
                        if(text.state !is DataState.Error) DataState.Error(e)
                    }
                }
                text.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> if(it.value != value) value = it.value
                    }
                }.autodispose()
            }
        }
    }

    override fun password(
        text: Changeable<String>,
        label: String,
        keyboardHints: KeyboardHints,
        icon: ImageWithSetting?,
        validationIssue: Changing<String?>
    ): Unit = with(html) {
        label {
            span {
                text(label)
            }
            input {
                type = "password"
                addOnValue {
                    val s = DataState.Ready(it)
                    try {
                        if(text.state != s) text.state = s
                    } catch(e: IllegalArgumentException) {
                        if(text.state !is DataState.Error) DataState.Error(e)
                    }
                }
                text.subscribeAndNow {
                    when(it) {
                        is DataState.Error -> { /* TODO */ }
                        DataState.Loading -> { /* TODO */ }
                        is DataState.LoadingWithExample -> { /* TODO */ }
                        is DataState.Ready -> value = it.value
                    }
                }.autodispose()
            }
        }
    }

    override fun <T> select(
        selected: Changeable<T>,
        options: Changing<List<T>>,
        label: String,
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
        content()
        lastCompleted?.style?.flexBasis = number.toString()
    }

    override fun overlap(content: () -> Unit): Unit = with(html) {
        div {
            className = "overlap"
            content()
        }
    }

    override fun scrolls(content: () -> Unit): Unit = with(html) {
        div {
            className = "scrolls"
            content()
        }
    }

    override fun frame(horizontal: Align, vertical: Align, margin: Int, content: () -> Unit): Unit = with(html) {
        div {
            className = "frame"
            style.margin = margin.toString() + "px"
            // TODO: horizontal
            // TODO: vertical
            content()
        }
    }

    override fun shown(shown: Changing<Boolean>, content: () -> Unit): Unit = with(html) {
        content()
        val element = lastCompleted
        shown.subscribeAndNow {
            when(it){
                is DataState.Error -> element?.hidden = true
                DataState.Loading -> element?.hidden = true
                is DataState.LoadingWithExample -> element?.hidden = true
                is DataState.Ready -> element?.hidden = !it.value
            }
        }.autodispose()
    }

    override fun alpha(alpha: Changing<Float>, content: () -> Unit): Unit = with(html) {
        content()
        val element = lastCompleted
        alpha.subscribeAndNow {
            when(it){
                is DataState.Error -> element?.style?.opacity = "0"
                DataState.Loading -> element?.style?.opacity = "0"
                is DataState.LoadingWithExample -> element?.style?.opacity = "0"
                is DataState.Ready -> element?.style?.opacity = it.value.toString()
            }
        }.autodispose()
    }

    override fun card(importance: Importance, content: () -> Unit): Unit = with(html) {
        div {
            className = "card"
            content()
        }
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