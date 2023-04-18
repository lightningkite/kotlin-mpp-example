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
    val action: Action? = null
)
enum class AutoComplete { Email, Password, NewPassword, Phone }
enum class KeyboardCase { None, Letters, Words, Sentences }
enum class KeyboardType { Text, Integer, Phone, Decimal }

interface ViewGenerator { fun <V> generate(factory: ViewFactory<V>): V }
annotation class Autopath
interface Screen: ViewGenerator {
    val path: String
    val title: String
    val actions: Data<Action>
}

interface Strings {
    companion object {
        var locale: Strings = object: Strings {}
    }
    
    val example get() = "Example"
}

interface ViewFactory<V> {
    fun header(layer: Int, text: Data<String>): V
    fun body(text: Data<String>): V
    fun hint(text: Data<String>): V
    fun button(text: Data<String>, disabled: Data<String?> = Constant(null), action: suspend () -> Unit): V
    fun boolean(value: EditableData<Boolean>, label: String, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun date(date: EditableData<LocalDate?>, hint: String, min: Data<LocalDate?> = Constant(null), max: Data<LocalDate?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun time(date: EditableData<LocalTime?>, hint: String, min: Data<LocalTime?> = Constant(null), max: Data<LocalTime?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun dateTime(date: EditableData<LocalDateTime?>, hint: String, min: Data<LocalDateTime?> = Constant(null), max: Data<LocalDateTime?> = Constant(null), icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun field(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun textArea(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun password(text: EditableData<String>, hint: String, keyboardHints: KeyboardHints, icon: Icon? = null, validationIssue: Data<String?> = Constant(null)): V
    fun <T> select(selected: EditableData<T>, options: Data<List<T>>, toString: (T)->String = { it.toString() }, validationIssue: Data<String?> = Constant(null), preferRadio: Boolean = false): V
    fun row(vararg views: Array<V>): V
    fun col(vararg views: Array<V>): V
    fun V.weight(number: Float): V
    fun overlap(vararg views: Array<V>): V
    fun V.scrolls(): V
    fun V.frame(horizontal: Align, vertical: Align, margin: Int): V
    fun V.shown(shown: Data<Boolean>): V
    fun V.alpha(alpha: Data<Float>): V
    fun card(content: V): V
    fun space(magnitude: Int): V
    fun icon(source: Data<Icon>): V
    fun image(source: Data<Image>): V
    fun circleImage(source: Data<Image>): V
    fun pages(pages: List<Screen>): V
    fun tabs(tabs: List<Tab>): V
    fun stackControls(stack: EditableData<List<Screen>>): V
    fun stackView(stack: Data<List<Screen>>): V
    fun <V> list(items: EditableData<List<V>>, display: (Data<V>) -> V): V
    fun <V> list(items: EditableData<List<V>>, identity: (V)->Long, display: (Data<V>) -> V): V
    fun V.expandingContent(expanded: EditableData<Boolean> = Property(false), content: V): V
    fun lazy(view: Data<V>): V
}

fun <V> ViewFactory<V>.header(layer: Int, text: String): V = header(layer, Constant(text))
fun <V> ViewFactory<V>.h1(text: String): V = header(1, Constant(text))
fun <V> ViewFactory<V>.h2(text: String): V = header(2, Constant(text))
fun <V> ViewFactory<V>.h3(text: String): V = header(3, Constant(text))
fun <V> ViewFactory<V>.h4(text: String): V = header(4, Constant(text))
fun <V> ViewFactory<V>.h5(text: String): V = header(5, Constant(text))
fun <V> ViewFactory<V>.h6(text: String): V = header(6, Constant(text))
fun <V, T> ViewFactory<V>.select(selected: EditableData<T>, options: List<T>, toString: (T)->String = { it.toString() }, validationIssue: Data<String?> = Constant(null)): V
        = select<T>(selected, Constant(options), toString, validationIssue)
fun <V> ViewFactory<V>.body(text: String): V = body(Constant(text))
fun <V> ViewFactory<V>.button(text: String, disabled: Data<String?> = Constant(null), action: suspend () -> Unit): V = button(Constant(text), disabled, action)
fun <V> ViewFactory<V>.icon(icon: Icon): V = icon(Constant(icon))
fun <V> ViewFactory<V>.image(image: Image): V = image(Constant(image))
fun <V> ViewFactory<V>.circleImage(image: Image): V = circleImage(Constant(image))
