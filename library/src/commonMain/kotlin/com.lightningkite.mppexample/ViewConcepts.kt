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
data class Tab(
    val title: String,
    val icon: Image,
    val onSelect: ()->Unit,
    val onReselect: ()->Unit = onSelect,
)
data class Action(
    val title: String,
    val icon: Image,
    val onSelect: ()->Unit
)
data class KeyboardHints(
    val case: KeyboardCase,
    val type: KeyboardType,
    val autocomplete: AutoComplete? = null,
    val action: Action? = null
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
enum class Importance { Accent, Primary, Normal }

sealed class MenuItem {
    data class Category(val name: String, val icon: Image? = null, val items: List<MenuItem>, val action: ()->Unit): MenuItem()
    data class Action(val name: String, val icon: Image? = null, val action: ()->Unit): MenuItem()
}