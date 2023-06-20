package com.lightningkite.mppexample

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

interface SemanticRenderer {
    fun image(source: Changing<ImageWithSetting>)
    fun circleImage(source: Changing<ImageWithSetting>)
    fun text(text: Changing<String>, meaning: TextMeaning, size: Float)

    fun button(action: Action, importance: Importance = Importance.Normal, disabled: Changing<String?> = Constant(null), text: Changing<String> = Constant(action.title))
    fun switch(value: Changeable<Boolean>, label: String, icon: ImageWithSetting? = null, help: String? = null)
    fun textField(text: Changeable<String>, label: String, keyboardHints: KeyboardHints,  action: ActionWithInput<String>)

    fun slider(info: FieldInfo, value: Changeable<Int>, range: IntRange, )
    fun slider(info: FieldInfo, value: Changeable<Float>, range: ClosedFloatingPointRange<Float>, )
    fun checkbox(info: FieldInfo, value: Changeable<Boolean>, )
    fun date(info: FieldInfo, date: Changeable<LocalDate?>, min: Changing<LocalDate?> = Constant(null), max: Changing<LocalDate?> = Constant(null), )
    fun time(info: FieldInfo, date: Changeable<LocalTime?>, min: Changing<LocalTime?> = Constant(null), max: Changing<LocalTime?> = Constant(null), )
    fun dateTime(info: FieldInfo, date: Changeable<LocalDateTime?>, min: Changing<LocalDateTime?> = Constant(null), max: Changing<LocalDateTime?> = Constant(null), )
    fun buttonInput(info: FieldInfo, text: Changing<String>, validationIssue: Changing<String?>, onClick: suspend ()->Unit)
    fun textField(info: FieldInfo, text: Changeable<String>, keyboardHints: KeyboardHints, hint: String = "", )
    fun textArea(info: FieldInfo, text: Changeable<String>, keyboardHints: KeyboardHints, hint: String = "", )
    fun password(info: FieldInfo, text: Changeable<String>, keyboardHints: KeyboardHints, hint: String = "", )
    fun <T> radio(info: FieldInfo, selected: Changeable<T>, options: Changing<List<T>>, toString: (T)->String = { it.toString() },)
    fun <T> dropdown(info: FieldInfo, selected: Changeable<T>, options: Changing<List<T>>, toString: (T)->String = { it.toString() },)
    fun <T> autocomplete(info: FieldInfo, selected: Changeable<T>, search: Changeable<String>, options: Changing<List<T>>, toString: (T) -> String = { it.toString() }, )

    fun row(content: ()->Unit)
    fun col(content: ()->Unit)
    fun weight(number: Float, content: ()->Unit)
    fun overlap(content: ()->Unit)
    fun scrolls(content: ()->Unit)
    fun frame(horizontal: Align, vertical: Align, margin: Int, content: ()->Unit)

    fun shown(shown: Changing<Boolean>, content: ()->Unit)
    fun enabled(enabled: Changing<Boolean>, content: ()->Unit)
    fun space(magnitude: Int)
    fun divider()
    fun card(importance: Importance = Importance.Normal, onClick: (suspend ()->Unit)? = null, content: ()->Unit)
    fun bar(importance: Importance = Importance.Normal, content: ()->Unit)

    // L2
    fun <CONTEXT> navigation(
        context: CONTEXT,
        sections: List<AppSection<CONTEXT>>,
        screenStack: Changeable<List<Screen<CONTEXT>>>,
//        auth: Changing<>
    )
    fun <CONTEXT> paged(
        context: CONTEXT,
        pages: List<Screen<CONTEXT>>,
    )
    fun <CONTEXT> tabbedSection(
        context: CONTEXT,
        tabs: List<Screen<CONTEXT>>,
    )

    fun <T> list(
        items: Changing<List<T>>,
        columns: Int = 1,
        reverse: Boolean = false,
        horizontal: Boolean = false,
        refresh: (suspend ()->Unit)? = null,
        scrolledToEnd: (suspend ()->Unit)? = null,
        select: (suspend (T)->Unit)? = null,
        multiSelect: List<ActionWithInput<Set<T>>> = listOf(),
        display: (Changing<T>) -> Unit
    )

    fun lazy(view: Changing<()->Unit>)

    fun expandingContent(expanded: Changeable<Boolean> = Property(false), content: ()->Unit)
}

//interface RL1 {
//
//    fun capWidth(width: Float, content: ()->Unit)
//    fun capHeight(height: Float, content: ()->Unit)
//    fun forceWidth(width: Float, content: ()->Unit)
//    fun forceHeight(height: Float, content: ()->Unit)
//    fun requireWidth(width: Float, content: ()->Unit)
//    fun requireHeight(height: Float, content: ()->Unit)
//
//    fun background(
//        borderColor: Color,
//        borderWidth: Float,
//        fillColor: Color,
//        topLeftRadius: Float,
//        topRightRadius: Float,
//        bottomLeftRadius: Float,
//        bottomRightRadius: Float,
//        elevation: Float,
//        content: () -> Unit
//    )
//
//}

//fun SemanticRenderer.header(layer: Int, text: String) = header(layer, Constant(text))
//fun SemanticRenderer.h1(text: String) = header(1, Constant(text))
//fun SemanticRenderer.h2(text: String) = header(2, Constant(text))
//fun SemanticRenderer.h3(text: String) = header(3, Constant(text))
//fun SemanticRenderer.h4(text: String) = header(4, Constant(text))
//fun SemanticRenderer.h5(text: String) = header(5, Constant(text))
//fun SemanticRenderer.h6(text: String) = header(6, Constant(text))
//fun SemanticRenderer.body(text: String) = body(Constant(text))
//fun <T> SemanticRenderer.select(selected: Changeable<T>, options: List<T>, label: String, toString: (T)->String = { it.toString() }, validationIssue: Changing<String?> = Constant(null))
//        = select<T>(selected, Constant(options), label, toString, validationIssue)
//fun SemanticRenderer.button(text: String, importance: Importance = Importance.Normal, disabled: Changing<String?> = Constant(null), action: suspend () -> Unit) = button(Constant(text), importance, disabled, action)
fun SemanticRenderer.image(image: ImageWithSetting) = image(Constant(image))
fun SemanticRenderer.circleImage(image: ImageWithSetting) = circleImage(Constant(image))
