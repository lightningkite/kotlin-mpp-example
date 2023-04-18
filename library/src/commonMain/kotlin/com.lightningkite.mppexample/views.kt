package com.lightningkite.mppexample

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

enum class Align { Start, Center, End, Fill }
typealias Image = String
typealias Icon = String
data class Tab(
    val title: String,
    val icon: Icon,
    val onSelect: ()->Unit,
    val onReselect: ()->Unit = onSelect,
)
data class Action(
    val title: String,
    val icon: Icon,
    val onSelect: ()->Unit
)
data class KeyboardHints(
    val autocomplete: AutoComplete,
    val case: KeyboardCase,
    val type: KeyboardType,
)
enum class AutoComplete { Email, Password, NewPassword, Phone }
enum class KeyboardCase { None, Letters, Words, Sentences }
enum class KeyboardType { Text, Integer, Phone, Decimal }

interface HasView { val view: PlatformView }
interface Screen: HasView {
    val path: String
    val title: String
    val actions: Data<Action>
}

data class Theme(
    val primary: Color,
    val accent: Color,
    val
)

expect fun header(layer: Int, text: Data<String>): PlatformView
expect fun body(text: Data<String>): PlatformView
expect fun hint(text: Data<String>): PlatformView
expect fun button(text: Data<String>, disabled: Data<String?> = Constant(null), action: suspend () -> Unit): PlatformView
expect fun boolean(value: EditableData<Boolean>, label: String, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun date(date: EditableData<LocalDate?>, hint: String, min: Data<LocalDate?> = Constant(null), max: Data<LocalDate?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun time(date: EditableData<LocalTime?>, hint: String, min: Data<LocalTime?> = Constant(null), max: Data<LocalTime?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun dateTime(date: EditableData<LocalDateTime?>, hint: String, min: Data<LocalDateTime?> = Constant(null), max: Data<LocalDateTime?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun field(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun textArea(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun password(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): PlatformView
expect fun <T> select(selected: EditableData<T>, options: Data<List<T>>, toString: (T)->String = { it.toString() }, validationIssue: Data<String?> = Constant(null), preferRadio: Boolean = false): PlatformView
expect fun row(vararg views: Array<PlatformView>): PlatformView
expect fun col(vararg views: Array<PlatformView>): PlatformView
expect fun PlatformView.weight(number: Float): PlatformView
expect fun overlap(vararg views: Array<PlatformView>): PlatformView
expect fun PlatformView.scrolls(): PlatformView
expect fun PlatformView.frame(horizontal: Align, vertical: Align): PlatformView
expect fun PlatformView.shown(shown: Data<Boolean>): PlatformView
expect fun PlatformView.alpha(alpha: Data<Float>): PlatformView
expect fun card(content: PlatformView): PlatformView
expect fun space(magnitude: Int): PlatformView
expect fun icon(source: Data<Icon>): PlatformView
expect fun image(source: Data<Image>): PlatformView
expect fun circleImage(source: Data<Image>): PlatformView
expect fun pages(pages: List<Screen>): PlatformView
expect fun tabs(tabs: List<Tab>): PlatformView
expect fun navigation(stack: EditableData<List<Screen>>): PlatformView
expect fun <T> list(items: EditableData<List<T>>, display: (Data<T>) -> PlatformView): PlatformView
expect fun <T> list(items: EditableData<List<T>>, identity: (T)->Long, display: (Data<T>) -> PlatformView): PlatformView
expect fun PlatformView.expandingContent(expanded: EditableData<Boolean> = Property(false), content: PlatformView): PlatformView
expect fun lazy(view: Data<PlatformView>): PlatformView

fun header(layer: Int, text: String): PlatformView = header(layer, Constant(text))
fun h1(text: String): PlatformView = header(1, Constant(text))
fun h2(text: String): PlatformView = header(2, Constant(text))
fun h3(text: String): PlatformView = header(3, Constant(text))
fun h4(text: String): PlatformView = header(4, Constant(text))
fun h5(text: String): PlatformView = header(5, Constant(text))
fun h6(text: String): PlatformView = header(6, Constant(text))
fun <T> select(selected: EditableData<T>, options: List<T>, toString: (T)->String = { it.toString() }, validationIssue: Data<String?> = Constant(null)): PlatformView
        = select(selected, Constant(options), toString, validationIssue)
fun body(text: String): PlatformView = body(Constant(text))
fun button(text: String, disabled: Data<String?> = Constant(null), action: suspend () -> Unit): PlatformView = button(Constant(text), enabled, action)
fun icon(icon: Icon): PlatformView = icon(Constant(icon))
fun image(image: Image): PlatformView = image(Constant(image))
fun circleImage(image: Image): PlatformView = circleImage(Constant(image))
