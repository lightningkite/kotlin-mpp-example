package com.lightningkite.mppexample

//expect abstract class Image {}
typealias Image = String

enum class Align { Start, Center, End, Fill }
data class ImageWithSetting(
    val image: Image,
    val background: Color = Color.transparent,
    val mode: ImageMode,
    val limitWidth: Int = -1,
    val limitHeight: Int = -1
)
enum class ImageMode { Fit, Crop, Stretch, NoScale }
data class AppSection<CONTEXT>(
    val title: String,
    val icon: Image,
    val viewGenerator: Screen<CONTEXT>,
    val children: List<AppSection<CONTEXT>> = listOf()
)
data class Tab(
    val title: String,
    val icon: Image,
    val onSelect: ()->Unit,
    val onReselect: ()->Unit = onSelect,
)
data class MenuItem(
    val title: String,
    val icon: Image,
    val onSelect: ()->Unit,
    val children: List<MenuItem> = listOf(),
)
data class Action(
    val title: String,
    val icon: Image,
    val onSelect: suspend ()->Unit
)
data class ActionWithInput<T>(
    val title: String,
    val icon: Image,
    val onSelect: suspend (T)->Unit
)
data class KeyboardHints(
    val case: KeyboardCase,
    val type: KeyboardType,
    val autocomplete: AutoComplete? = null
) {
    companion object {
        val paragraph = KeyboardHints(KeyboardCase.Sentences, KeyboardType.Text)
        val title = KeyboardHints(KeyboardCase.Words, KeyboardType.Text)
        val id = KeyboardHints(KeyboardCase.Letters, KeyboardType.Text)
        val integer = KeyboardHints(KeyboardCase.None, KeyboardType.Integer)
        val decimal = KeyboardHints(KeyboardCase.None, KeyboardType.Decimal)
        val phone = KeyboardHints(KeyboardCase.None, KeyboardType.Phone)
        val password = KeyboardHints(KeyboardCase.None, KeyboardType.Text)
    }
}
enum class AutoComplete { Email, Password, NewPassword, Phone }
enum class KeyboardCase { None, Letters, Words, Sentences }
enum class KeyboardType { Text, Integer, Phone, Decimal }
enum class Importance { Fade, Normal, Primary, Accent }
enum class TextMeaning {
    PageTitle,
    SectionTitle,
    Body,
    Comment
}

class FieldInfo(
    val label: String,
    val help: String? = null,
    val icon: ImageWithSetting? = null,
    val validationIssue: Changing<String?> = Constant(null)
)