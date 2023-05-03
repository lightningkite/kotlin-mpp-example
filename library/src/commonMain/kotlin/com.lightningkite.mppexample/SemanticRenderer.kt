package com.lightningkite.mppexample

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

interface SemanticRenderer {
    fun header(layer: Int, text: Changing<String>)
    fun body(text: Changing<String>)
    fun hint(text: Changing<String>)
    fun button(text: Changing<String>, importance: Importance = Importance.Normal, disabled: Changing<String?> = Constant(null), action: suspend () -> Unit)
    fun boolean(value: Changeable<Boolean>, label: String, icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun date(date: Changeable<LocalDate?>, hint: String, min: Changing<LocalDate?> = Constant(null), max: Changing<LocalDate?> = Constant(null), icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun time(date: Changeable<LocalTime?>, hint: String, min: Changing<LocalTime?> = Constant(null), max: Changing<LocalTime?> = Constant(null), icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun dateTime(date: Changeable<LocalDateTime?>, hint: String, min: Changing<LocalDateTime?> = Constant(null), max: Changing<LocalDateTime?> = Constant(null), icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun field(text: Changeable<String>, hint: String, keyboardHints: KeyboardHints, icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun textArea(text: Changeable<String>, hint: String, keyboardHints: KeyboardHints, icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun password(text: Changeable<String>, hint: String, keyboardHints: KeyboardHints, icon: ImageWithSetting? = null, validationIssue: Changing<String?> = Constant(null))
    fun <T> select(selected: Changeable<T>, options: Changing<List<T>>, toString: (T)->String = { it.toString() }, validationIssue: Changing<String?> = Constant(null), preferRadio: Boolean = false)
    fun row(content: ()->Unit)
    fun col(content: ()->Unit)
    fun weight(number: Float, content: ()->Unit)
    fun overlap(content: ()->Unit)
    fun scrolls(content: ()->Unit)
    fun frame(horizontal: Align, vertical: Align, margin: Int, content: ()->Unit)
    fun shown(shown: Changing<Boolean>, content: ()->Unit)
    fun alpha(alpha: Changing<Float>, content: ()->Unit)
    fun card(importance: Importance = Importance.Normal, content: ()->Unit)
    fun space(magnitude: Int)
    fun image(source: Changing<ImageWithSetting>)
    fun circleImage(source: Changing<ImageWithSetting>)
    fun pages(pages: List<()->Unit>)
    fun sectionNavigation(tabs: List<Tab>)
    fun <CONTEXT> stackControls(context: CONTEXT, stack: RelativeNavigation<CONTEXT>)
    fun <CONTEXT> stackView(context: CONTEXT, stack: RelativeNavigation<CONTEXT>)
    fun <T> list(items: Changeable<List<T>>, display: (Changing<T>) -> Unit)
    fun <T> list(items: Changeable<List<T>>, identity: (T)->Long, display: (Changing<T>) -> Unit)
    fun expandingContent(expanded: Changeable<Boolean> = Property(false), content: ()->Unit)
    fun onClick(action: ()->Unit, content: ()->Unit)
    fun lazy(view: Changing<()->Unit>)
}

fun SemanticRenderer.header(layer: Int, text: String) = header(layer, Constant(text))
fun SemanticRenderer.h1(text: String) = header(1, Constant(text))
fun SemanticRenderer.h2(text: String) = header(2, Constant(text))
fun SemanticRenderer.h3(text: String) = header(3, Constant(text))
fun SemanticRenderer.h4(text: String) = header(4, Constant(text))
fun SemanticRenderer.h5(text: String) = header(5, Constant(text))
fun SemanticRenderer.h6(text: String) = header(6, Constant(text))
fun <T> SemanticRenderer.select(selected: Changeable<T>, options: List<T>, toString: (T)->String = { it.toString() }, validationIssue: Changing<String?> = Constant(null))
        = select<T>(selected, Constant(options), toString, validationIssue)
fun SemanticRenderer.body(text: String) = body(Constant(text))
fun SemanticRenderer.button(text: String, importance: Importance = Importance.Normal, disabled: Changing<String?> = Constant(null), action: suspend () -> Unit) = button(Constant(text), importance, disabled, action)
fun SemanticRenderer.image(image: ImageWithSetting) = image(Constant(image))
fun SemanticRenderer.circleImage(image: ImageWithSetting) = circleImage(Constant(image))

@Autopath
class Sample(val id: Int): Screen<SemanticRenderer> {
    override val title: Changing<String> get() = Constant("Title")
    override val actions: Changing<List<Action>> get() = Constant(listOf())

    val data = Constant("Test")
    val shouldShow = Property(false)

    override fun render(context: SemanticRenderer) = with(context) {
        col {
            h1("Hello world!")
            shown(shouldShow) {
                body(data)
            }
            button("Go to screen") {
                shouldShow.value = !shouldShow.value
            }
        }
    }
}