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
    val autocomplete: AutoComplete,
    val case: KeyboardCase,
    val type: KeyboardType,
    val action: Action? = null
)
enum class AutoComplete { Email, Password, NewPassword, Phone }
enum class KeyboardCase { None, Letters, Words, Sentences }
enum class KeyboardType { Text, Integer, Phone, Decimal }
enum class Importance { Accent, Primary, Normal }