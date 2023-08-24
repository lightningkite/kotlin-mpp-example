package com.lightningkite.mppexample

expect class Dimension

expect val DimensionZero: Dimension

expect class Font

expect val systemDefaultFont: Font

sealed class ImageSource
data class ImagePath(val fillColor: Color, val lineColor: Color, val lineWidth: Dimension, val path: String): ImageSource()
data class ImageRemote(val url: String): ImageSource()
class ImageRaw(val data: ByteArray): ImageSource()
expect class ImageResource: ImageSource

expect class Drawable
expect fun Drawable(color: Color): Drawable

//expect fun Drawable(
//    fillColor: Color,
//    strokeColor: Color,
//    strokeWidth: Dimension,
//    corners: CornerRadii? = CornerRadii(DimensionZero)
//): Drawable
//
//expect fun Drawable(
//    normal: Drawable,
//    down: Drawable? = null,
//    hover: Drawable? = null,
//    disabled: Drawable? = null,
//    checked: Drawable? = null,
//    checkedDown: Drawable? = null,
//    checkedHover: Drawable? = null,
//    checkedDisabled: Drawable? = null,
//): Drawable

data class CornerRadii(
    val topLeft: Dimension,
    val topRight: Dimension,
    val bottomLeft: Dimension,
    val bottomRight: Dimension
) {
    constructor(all: Dimension) : this(all, all, all, all)
}

data class Insets(val left: Dimension, val top: Dimension, val right: Dimension, val bottom: Dimension) {
    constructor(all: Dimension) : this(all, all, all, all)
}

data class TextStyle(
    val color: Color = Color.black,
    val font: Font,
    val bold: Boolean,
    val italic: Boolean,
    val allCaps: Boolean,
    val lineSpacingMultiplier: Double,
    val letterSpacing: Dimension,
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
data class Action(
    val title: String,
    val icon: ImageSource,
    val onSelect: () -> Unit
)

enum class ImageMode { Fit, Crop, Stretch, NoScale }
data class Tab(
    val title: String,
    val icon: Image,
    val onSelect: () -> Unit,
    val onReselect: () -> Unit = onSelect,
)
