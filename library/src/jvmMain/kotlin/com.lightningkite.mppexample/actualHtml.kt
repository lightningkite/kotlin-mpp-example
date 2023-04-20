@file:Suppress("NO_ACTUAL_FOR_EXPECT")
package com.lightningkite.mppexample

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CSSStyleDeclarationImpl(): CSSStyleDeclaration() {
}
actual abstract class CSSStyleDeclaration {
    val priorities = HashMap<String, String>()
    val properties = HashMap<String, String>()
    class PropertyDelegate(val key: String): ReadWriteProperty<CSSStyleDeclaration, String> {
        override fun getValue(thisRef: CSSStyleDeclaration, property: KProperty<*>): String = thisRef.properties[key] ?: ""
        override fun setValue(thisRef: CSSStyleDeclaration, property: KProperty<*>, value: String) {
            thisRef.properties[key] = value
        }
    }
    actual open var cssText: String by PropertyDelegate("text")
    actual open var cssFloat: String by PropertyDelegate("float")
    actual open var alignContent: String by PropertyDelegate("align-content")
    actual open var alignItems: String by PropertyDelegate("align-items")
    actual open var alignSelf: String by PropertyDelegate("align-self")
    actual open var animation: String by PropertyDelegate("animation")
    actual open var animationDelay: String by PropertyDelegate("animation-delay")
    actual open var animationDirection: String by PropertyDelegate("animation-direction")
    actual open var animationDuration: String by PropertyDelegate("animation-duration")
    actual open var animationFillMode: String by PropertyDelegate("animation-fill-mode")
    actual open var animationIterationCount: String by PropertyDelegate("animation-iteration-count")
    actual open var animationName: String by PropertyDelegate("animation-name")
    actual open var animationPlayState: String by PropertyDelegate("animation-play-state")
    actual open var animationTimingFunction: String by PropertyDelegate("animation-timing-function")
    actual open var backfaceVisibility: String by PropertyDelegate("backface-visibility")
    actual open var background: String by PropertyDelegate("background")
    actual open var backgroundAttachment: String by PropertyDelegate("background-attachment")
    actual open var backgroundClip: String by PropertyDelegate("background-clip")
    actual open var backgroundColor: String by PropertyDelegate("background-color")
    actual open var backgroundImage: String by PropertyDelegate("background-image")
    actual open var backgroundOrigin: String by PropertyDelegate("background-origin")
    actual open var backgroundPosition: String by PropertyDelegate("background-position")
    actual open var backgroundRepeat: String by PropertyDelegate("background-repeat")
    actual open var backgroundSize: String by PropertyDelegate("background-size")
    actual open var border: String by PropertyDelegate("border")
    actual open var borderBottom: String by PropertyDelegate("border-bottom")
    actual open var borderBottomColor: String by PropertyDelegate("border-bottom-color")
    actual open var borderBottomLeftRadius: String by PropertyDelegate("border-bottom-left-radius")
    actual open var borderBottomRightRadius: String by PropertyDelegate("border-bottom-right-radius")
    actual open var borderBottomStyle: String by PropertyDelegate("border-bottom-style")
    actual open var borderBottomWidth: String by PropertyDelegate("border-bottom-width")
    actual open var borderCollapse: String by PropertyDelegate("border-collapse")
    actual open var borderColor: String by PropertyDelegate("border-color")
    actual open var borderImage: String by PropertyDelegate("border-image")
    actual open var borderImageOutset: String by PropertyDelegate("border-image-outset")
    actual open var borderImageRepeat: String by PropertyDelegate("border-image-repeat")
    actual open var borderImageSlice: String by PropertyDelegate("border-image-slice")
    actual open var borderImageSource: String by PropertyDelegate("border-image-source")
    actual open var borderImageWidth: String by PropertyDelegate("border-image-width")
    actual open var borderLeft: String by PropertyDelegate("border-left")
    actual open var borderLeftColor: String by PropertyDelegate("border-left-color")
    actual open var borderLeftStyle: String by PropertyDelegate("border-left-style")
    actual open var borderLeftWidth: String by PropertyDelegate("border-left-width")
    actual open var borderRadius: String by PropertyDelegate("border-radius")
    actual open var borderRight: String by PropertyDelegate("border-right")
    actual open var borderRightColor: String by PropertyDelegate("border-right-color")
    actual open var borderRightStyle: String by PropertyDelegate("border-right-style")
    actual open var borderRightWidth: String by PropertyDelegate("border-right-width")
    actual open var borderSpacing: String by PropertyDelegate("border-spacing")
    actual open var borderStyle: String by PropertyDelegate("border-style")
    actual open var borderTop: String by PropertyDelegate("border-top")
    actual open var borderTopColor: String by PropertyDelegate("border-top-color")
    actual open var borderTopLeftRadius: String by PropertyDelegate("border-top-left-radius")
    actual open var borderTopRightRadius: String by PropertyDelegate("border-top-right-radius")
    actual open var borderTopStyle: String by PropertyDelegate("border-top-style")
    actual open var borderTopWidth: String by PropertyDelegate("border-top-width")
    actual open var borderWidth: String by PropertyDelegate("border-width")
    actual open var bottom: String by PropertyDelegate("bottom")
    actual open var boxDecorationBreak: String by PropertyDelegate("box-decoration-break")
    actual open var boxShadow: String by PropertyDelegate("box-shadow")
    actual open var boxSizing: String by PropertyDelegate("box-sizing")
    actual open var breakAfter: String by PropertyDelegate("break-after")
    actual open var breakBefore: String by PropertyDelegate("break-before")
    actual open var breakInside: String by PropertyDelegate("break-inside")
    actual open var captionSide: String by PropertyDelegate("caption-side")
    actual open var clear: String by PropertyDelegate("clear")
    actual open var clip: String by PropertyDelegate("clip")
    actual open var color: String by PropertyDelegate("color")
    actual open var columnCount: String by PropertyDelegate("column-count")
    actual open var columnFill: String by PropertyDelegate("column-fill")
    actual open var columnGap: String by PropertyDelegate("column-gap")
    actual open var columnRule: String by PropertyDelegate("column-rule")
    actual open var columnRuleColor: String by PropertyDelegate("column-rule-color")
    actual open var columnRuleStyle: String by PropertyDelegate("column-rule-style")
    actual open var columnRuleWidth: String by PropertyDelegate("column-rule-width")
    actual open var columnSpan: String by PropertyDelegate("column-span")
    actual open var columnWidth: String by PropertyDelegate("column-width")
    actual open var columns: String by PropertyDelegate("columns")
    actual open var content: String by PropertyDelegate("content")
    actual open var counterIncrement: String by PropertyDelegate("counter-increment")
    actual open var counterReset: String by PropertyDelegate("counter-reset")
    actual open var cursor: String by PropertyDelegate("cursor")
    actual open var direction: String by PropertyDelegate("direction")
    actual open var display: String by PropertyDelegate("display")
    actual open var emptyCells: String by PropertyDelegate("empty-cells")
    actual open var filter: String by PropertyDelegate("filter")
    actual open var flex: String by PropertyDelegate("flex")
    actual open var flexBasis: String by PropertyDelegate("flex-basis")
    actual open var flexDirection: String by PropertyDelegate("flex-direction")
    actual open var flexFlow: String by PropertyDelegate("flex-flow")
    actual open var flexGrow: String by PropertyDelegate("flex-grow")
    actual open var flexShrink: String by PropertyDelegate("flex-shrink")
    actual open var flexWrap: String by PropertyDelegate("flex-wrap")
    actual open var font: String by PropertyDelegate("font")
    actual open var fontFamily: String by PropertyDelegate("font-family")
    actual open var fontFeatureSettings: String by PropertyDelegate("font-feature-settings")
    actual open var fontKerning: String by PropertyDelegate("font-kerning")
    actual open var fontLanguageOverride: String by PropertyDelegate("font-language-override")
    actual open var fontSize: String by PropertyDelegate("font-size")
    actual open var fontSizeAdjust: String by PropertyDelegate("font-size-adjust")
    actual open var fontStretch: String by PropertyDelegate("font-stretch")
    actual open var fontStyle: String by PropertyDelegate("font-style")
    actual open var fontSynthesis: String by PropertyDelegate("font-synthesis")
    actual open var fontVariant: String by PropertyDelegate("font-variant")
    actual open var fontVariantAlternates: String by PropertyDelegate("font-variant-alternates")
    actual open var fontVariantCaps: String by PropertyDelegate("font-variant-caps")
    actual open var fontVariantEastAsian: String by PropertyDelegate("font-variant-east-asian")
    actual open var fontVariantLigatures: String by PropertyDelegate("font-variant-ligatures")
    actual open var fontVariantNumeric: String by PropertyDelegate("font-variant-numeric")
    actual open var fontVariantPosition: String by PropertyDelegate("font-variant-position")
    actual open var fontWeight: String by PropertyDelegate("font-weight")
    actual open var hangingPunctuation: String by PropertyDelegate("hanging-punctuation")
    actual open var height: String by PropertyDelegate("height")
    actual open var hyphens: String by PropertyDelegate("hyphens")
    actual open var imageOrientation: String by PropertyDelegate("image-orientation")
    actual open var imageRendering: String by PropertyDelegate("image-rendering")
    actual open var imageResolution: String by PropertyDelegate("image-resolution")
    actual open var imeMode: String by PropertyDelegate("ime-mode")
    actual open var justifyContent: String by PropertyDelegate("justify-content")
    actual open var left: String by PropertyDelegate("left")
    actual open var letterSpacing: String by PropertyDelegate("letter-spacing")
    actual open var lineBreak: String by PropertyDelegate("line-break")
    actual open var lineHeight: String by PropertyDelegate("line-height")
    actual open var listStyle: String by PropertyDelegate("list-style")
    actual open var listStyleImage: String by PropertyDelegate("list-style-image")
    actual open var listStylePosition: String by PropertyDelegate("list-style-position")
    actual open var listStyleType: String by PropertyDelegate("list-style-type")
    actual open var margin: String by PropertyDelegate("margin")
    actual open var marginBottom: String by PropertyDelegate("margin-bottom")
    actual open var marginLeft: String by PropertyDelegate("margin-left")
    actual open var marginRight: String by PropertyDelegate("margin-right")
    actual open var marginTop: String by PropertyDelegate("margin-top")
    actual open var mark: String by PropertyDelegate("mark")
    actual open var markAfter: String by PropertyDelegate("mark-after")
    actual open var markBefore: String by PropertyDelegate("mark-before")
    actual open var marks: String by PropertyDelegate("marks")
    actual open var marqueeDirection: String by PropertyDelegate("marquee-direction")
    actual open var marqueePlayCount: String by PropertyDelegate("marquee-play-count")
    actual open var marqueeSpeed: String by PropertyDelegate("marquee-speed")
    actual open var marqueeStyle: String by PropertyDelegate("marquee-style")
    actual open var mask: String by PropertyDelegate("mask")
    actual open var maskType: String by PropertyDelegate("mask-type")
    actual open var maxHeight: String by PropertyDelegate("max-height")
    actual open var maxWidth: String by PropertyDelegate("max-width")
    actual open var minHeight: String by PropertyDelegate("min-height")
    actual open var minWidth: String by PropertyDelegate("min-width")
    actual open var navDown: String by PropertyDelegate("nav-down")
    actual open var navIndex: String by PropertyDelegate("nav-index")
    actual open var navLeft: String by PropertyDelegate("nav-left")
    actual open var navRight: String by PropertyDelegate("nav-right")
    actual open var navUp: String by PropertyDelegate("nav-up")
    actual open var objectFit: String by PropertyDelegate("object-fit")
    actual open var objectPosition: String by PropertyDelegate("object-position")
    actual open var opacity: String by PropertyDelegate("opacity")
    actual open var order: String by PropertyDelegate("order")
    actual open var orphans: String by PropertyDelegate("orphans")
    actual open var outline: String by PropertyDelegate("outline")
    actual open var outlineColor: String by PropertyDelegate("outline-color")
    actual open var outlineOffset: String by PropertyDelegate("outline-offset")
    actual open var outlineStyle: String by PropertyDelegate("outline-style")
    actual open var outlineWidth: String by PropertyDelegate("outline-width")
    actual open var overflowWrap: String by PropertyDelegate("overflow-wrap")
    actual open var overflowX: String by PropertyDelegate("overflow-x")
    actual open var overflowY: String by PropertyDelegate("overflow-y")
    actual open var padding: String by PropertyDelegate("padding")
    actual open var paddingBottom: String by PropertyDelegate("padding-bottom")
    actual open var paddingLeft: String by PropertyDelegate("padding-left")
    actual open var paddingRight: String by PropertyDelegate("padding-right")
    actual open var paddingTop: String by PropertyDelegate("padding-top")
    actual open var pageBreakAfter: String by PropertyDelegate("page-break-after")
    actual open var pageBreakBefore: String by PropertyDelegate("page-break-before")
    actual open var pageBreakInside: String by PropertyDelegate("page-break-inside")
    actual open var perspective: String by PropertyDelegate("perspective")
    actual open var perspectiveOrigin: String by PropertyDelegate("perspective-origin")
    actual open var phonemes: String by PropertyDelegate("phonemes")
    actual open var position: String by PropertyDelegate("position")
    actual open var quotes: String by PropertyDelegate("quotes")
    actual open var resize: String by PropertyDelegate("resize")
    actual open var rest: String by PropertyDelegate("rest")
    actual open var restAfter: String by PropertyDelegate("rest-after")
    actual open var restBefore: String by PropertyDelegate("rest-before")
    actual open var right: String by PropertyDelegate("right")
    actual open var tabSize: String by PropertyDelegate("tab-size")
    actual open var tableLayout: String by PropertyDelegate("table-layout")
    actual open var textAlign: String by PropertyDelegate("text-align")
    actual open var textAlignLast: String by PropertyDelegate("text-align-last")
    actual open var textCombineUpright: String by PropertyDelegate("text-combine-upright")
    actual open var textDecoration: String by PropertyDelegate("text-decoration")
    actual open var textDecorationColor: String by PropertyDelegate("text-decoration-color")
    actual open var textDecorationLine: String by PropertyDelegate("text-decoration-line")
    actual open var textDecorationStyle: String by PropertyDelegate("text-decoration-style")
    actual open var textIndent: String by PropertyDelegate("text-indent")
    actual open var textJustify: String by PropertyDelegate("text-justify")
    actual open var textOrientation: String by PropertyDelegate("text-orientation")
    actual open var textOverflow: String by PropertyDelegate("text-overflow")
    actual open var textShadow: String by PropertyDelegate("text-shadow")
    actual open var textTransform: String by PropertyDelegate("text-transform")
    actual open var textUnderlinePosition: String by PropertyDelegate("text-underline-position")
    actual open var top: String by PropertyDelegate("top")
    actual open var transform: String by PropertyDelegate("transform")
    actual open var transformOrigin: String by PropertyDelegate("transform-origin")
    actual open var transformStyle: String by PropertyDelegate("transform-style")
    actual open var transition: String by PropertyDelegate("transition")
    actual open var transitionDelay: String by PropertyDelegate("transition-delay")
    actual open var transitionDuration: String by PropertyDelegate("transition-duration")
    actual open var transitionProperty: String by PropertyDelegate("transition-property")
    actual open var transitionTimingFunction: String by PropertyDelegate("transition-timing-function")
    actual open var unicodeBidi: String by PropertyDelegate("unicode-bidi")
    actual open var verticalAlign: String by PropertyDelegate("vertical-align")
    actual open var visibility: String by PropertyDelegate("visibility")
    actual open var voiceBalance: String by PropertyDelegate("voice-balance")
    actual open var voiceDuration: String by PropertyDelegate("voice-duration")
    actual open var voicePitch: String by PropertyDelegate("voice-pitch")
    actual open var voicePitchRange: String by PropertyDelegate("voice-pitch-range")
    actual open var voiceRate: String by PropertyDelegate("voice-rate")
    actual open var voiceStress: String by PropertyDelegate("voice-stress")
    actual open var voiceVolume: String by PropertyDelegate("voice-volume")
    actual open var whiteSpace: String by PropertyDelegate("white-space")
    actual open var widows: String by PropertyDelegate("widows")
    actual open var width: String by PropertyDelegate("width")
    actual open var wordBreak: String by PropertyDelegate("word-break")
    actual open var wordSpacing: String by PropertyDelegate("word-spacing")
    actual open var wordWrap: String by PropertyDelegate("word-wrap")
    actual open var writingMode: String by PropertyDelegate("writing-mode")
    actual open var zIndex: String by PropertyDelegate("z-index")
    actual fun getPropertyValue(property: String): String = properties[property] ?: ""
    actual fun getPropertyPriority(property: String): String = priorities[property] ?: ""
    actual fun setProperty(property: String, value: String, priority: String) {
        properties[property] = value
        priorities[property] = priority
    }
    actual fun setPropertyValue(property: String, value: String) {
        properties[property] = value
    }
    actual fun setPropertyPriority(property: String, priority: String) {
        priorities[property] = priority
    }
    actual fun removeProperty(property: String): String {
        priorities.remove(property)
        return properties.remove(property) ?: ""
    }
}

actual abstract class Node {
    val children = ArrayList<Node>()
    actual fun appendChild(node: Node): Node {
        children.add(node)
        return node
    }
}
actual abstract class CharacterData: Node() {}
actual open class Text actual constructor(val data: String): CharacterData() {
    actual open val wholeText: String get() = data
}
actual abstract class Element: Node() {}

class HTMLElementImpl(val tag: String): HTMLElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLElement: Element() {
    actual open var accessKey: String = ""  // accesskey
    actual open var className: String = ""  // class
    actual open var dir: String = ""  // dir
    actual open var draggable: Boolean = false  // draggable
    actual open var hidden: Boolean = false  // hidden
    actual open var id: String = ""  // id
    actual open var lang: String = ""  // lang
    actual open var slot: String = ""  // slot
    actual open var spellcheck: Boolean = false  // spellcheck
    actual abstract val style: CSSStyleDeclaration  // style
    actual open var title: String = ""  // title
    actual open var translate: Boolean = false  // translate
}

class HTMLAnchorElementImpl(): HTMLAnchorElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
    override var href: String = ""
}
actual abstract class HTMLAnchorElement: HTMLElement() {
    actual open var download: String = ""  // download
    actual abstract var href: String  // href
    actual open var hreflang: String = ""  // hreflang
    actual open var ping: String = ""  // ping
    actual open var rel: String = ""  // rel
    actual open var shape: String = ""  // shape
    actual open var target: String = ""  // target
}
class HTMLAppletElementImpl(): HTMLAppletElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLAppletElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var alt: String = ""  // alt
    actual open var code: String = ""  // code
}
class HTMLAreaElementImpl(): HTMLAreaElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
    override var href: String = ""
}
actual abstract class HTMLAreaElement: HTMLElement() {
    actual open var alt: String = ""  // alt
    actual open var coords: String = ""  // coords
    actual open var download: String = ""  // download
    actual abstract var href: String  // href
    actual open var ping: String = ""  // ping
    actual open var rel: String = ""  // rel
    actual open var shape: String = ""  // shape
    actual open var target: String = ""  // target
}
class HTMLMediaElementImpl(): HTMLMediaElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMediaElement: HTMLElement() {
    actual open var autoplay: Boolean = false  // autoplay
//  actual open var buffered: String = ""  // buffered
    actual open var controls: Boolean = false  // controls
    actual open var loop: Boolean = false  // loop
    actual open var muted: Boolean = false  // muted
    actual open var preload: String = ""  // preload
    actual open var src: String = ""  // src
}
class HTMLAudioElementImpl(): HTMLAudioElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLAudioElement: HTMLMediaElement() {
}
class HTMLBaseElementImpl(): HTMLBaseElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLBaseElement: HTMLElement() {
    actual open var href: String = ""  // href
    actual open var target: String = ""  // target
}
class HTMLBodyElementImpl(): HTMLBodyElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLBodyElement: HTMLElement() {
    actual open var background: String = ""  // background
}
class HTMLButtonElementImpl(): HTMLButtonElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLButtonElement: HTMLElement() {
//  actual open var autofocus: String = ""  // autofocus
    actual open var disabled: Boolean = false  // disabled
//  actual open var form: String = ""  // form
    actual open var formAction: String = ""  // formaction
    actual open var formEnctype: String = ""  // formenctype
    actual open var formMethod: String = ""  // formmethod
    actual open var formNoValidate: Boolean = false  // formnovalidate
    actual open var formTarget: String = ""  // formtarget
    actual open var name: String = ""  // name
    actual open var type: String = ""  // type
    actual open var value: String = ""  // value
}
class HTMLCanvasElementImpl(): HTMLCanvasElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLCanvasElement: HTMLElement() {
    actual open var height: Int = 0  // height
    actual open var width: Int = 0  // width
}
class HTMLTableCaptionElementImpl(): HTMLTableCaptionElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableCaptionElement: HTMLElement() {
    actual open var align: String = ""  // align
}
class HTMLTableColElementImpl(): HTMLTableColElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableColElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var span: Int = 0  // span
}
class HTMLDataElementImpl(): HTMLDataElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLDataElement: HTMLElement() {
    actual open var value: String = ""  // value
}
class HTMLModElementImpl(): HTMLModElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLModElement: HTMLElement() {
    actual open var cite: String = ""  // cite
    actual open var dateTime: String = ""  // datetime
}
class HTMLDetailsElementImpl(): HTMLDetailsElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLDetailsElement: HTMLElement() {
    actual open var open: Boolean = false  // open
}
class HTMLDialogElementImpl(): HTMLDialogElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLDialogElement: HTMLElement() {
    actual open var open: Boolean = false  // open
}
class HTMLEmbedElementImpl(): HTMLEmbedElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLEmbedElement: HTMLElement() {
    actual open var height: String = ""  // height
    actual open var src: String = ""  // src
    actual open var type: String = ""  // type
    actual open var width: String = ""  // width
}
class HTMLFieldSetElementImpl(): HTMLFieldSetElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLFieldSetElement: HTMLElement() {
    actual open var disabled: Boolean = false  // disabled
//  actual open var form: String = ""  // form
    actual open var name: String = ""  // name
}
class HTMLFontElementImpl(): HTMLFontElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLFontElement: HTMLElement() {
    actual open var color: String = ""  // color
}
class HTMLFormElementImpl(): HTMLFormElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLFormElement: HTMLElement() {
    actual open var acceptCharset: String = ""  // accept-charset
    actual open var action: String = ""  // action
    actual open var autocomplete: String = ""  // autocomplete
    actual open var enctype: String = ""  // enctype
    actual open var method: String = ""  // method
    actual open var name: String = ""  // name
    actual open var noValidate: Boolean = false  // novalidate
    actual open var target: String = ""  // target
}
class HTMLHRElementImpl(): HTMLHRElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLHRElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var color: String = ""  // color
}
class HTMLIFrameElementImpl(): HTMLIFrameElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLIFrameElement: HTMLElement() {
    actual open var align: String = ""  // align
//  actual open var allow: String = ""  // allow
//  actual open var csp: String = ""  // csp Experimental
    actual open var height: String = ""  // height
//  actual open var loading: String = ""  // loading Experimental
    actual open var name: String = ""  // name
//  actual open var referrerpolicy: String = ""  // referrerpolicy
//  actual open var sandbox: String = ""  // sandbox
    actual open var src: String = ""  // src
    actual open var srcdoc: String = ""  // srcdoc
    actual open var width: String = ""  // width
}
class HTMLImageElementImpl(): HTMLImageElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLImageElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var alt: String = ""  // alt
    actual open var border: String = ""  // border
    actual open var height: Int = 0  // height
    actual open var isMap: Boolean = false  // ismap
//  actual open var loading: String = ""  // loading Experimental
//  actual open var referrerpolicy: String = ""  // referrerpolicy
    actual open var sizes: String = ""  // sizes
    actual open var src: String = ""  // src
    actual open var srcset: String = ""  // srcset
    actual open var useMap: String = ""  // usemap
    actual open var width: Int = 0  // width
}
class HTMLInputElementImpl(): HTMLInputElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLInputElement: HTMLElement() {
    actual open var accept: String = ""  // accept
    actual open var alt: String = ""  // alt
    actual open var autocomplete: String = ""  // autocomplete
    actual open var autofocus: Boolean = false  // autofocus
    actual open var checked: Boolean = false  // checked
    actual open var dirName: String = ""  // dirname
    actual open var disabled: Boolean = false  // disabled
    //  actual open var form: String = ""  // form
    actual open var formAction: String = ""  // formaction
    actual open var formEnctype: String = ""  // formenctype
    actual open var formMethod: String = ""  // formmethod
    actual open var formNoValidate: Boolean = false  // formnovalidate
    actual open var formTarget: String = ""  // formtarget
    actual open var height: Int = 0  // height
    //  actual open var list: String = ""  // list
    actual open var max: String = ""  // max
    actual open var maxLength: Int = 0  // maxlength
    actual open var minLength: Int = 0  // minlength
    actual open var min: String = ""  // min
    actual open var multiple: Boolean = false  // multiple
    actual open var name: String = ""  // name
    actual open var pattern: String = ""  // pattern
    actual open var placeholder: String = ""  // placeholder
    actual open var readOnly: Boolean = false  // readonly
    actual open var required: Boolean = false  // required
    actual open var size: Int = 0  // size
    actual open var src: String = ""  // src
    actual open var step: String = ""  // step
    actual open var type: String = ""  // type
    actual open var useMap: String = ""  // usemap
    actual open var value: String = ""  // value
    actual open var width: Int = 0  // width
}
class HTMLKeygenElementImpl(): HTMLKeygenElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLKeygenElement: HTMLElement() {
    actual open var autofocus: Boolean = false  // autofocus
    actual open var challenge: String = ""  // challenge
    actual open var disabled: Boolean = false  // disabled
//  actual open var form: String = ""  // form
    actual open var keytype: String = ""  // keytype
    actual open var name: String = ""  // name
}
class HTMLLabelElementImpl(): HTMLLabelElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLLabelElement: HTMLElement() {
    actual open var htmlFor: String = ""  // for
//  actual open var form: String = ""  // form
}
class HTMLLIElementImpl(): HTMLLIElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLLIElement: HTMLElement() {
    actual open var value: Int = 0  // value
}
class HTMLLinkElementImpl(): HTMLLinkElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLLinkElement: HTMLElement() {
    actual open var crossOrigin: String? = null  // crossorigin
    actual open var href: String = ""  // href
    actual open var hreflang: String = ""  // hreflang
    actual open var media: String = ""  // media
    actual open var referrerPolicy: String = ""  // referrerpolicy
    actual open var rel: String = ""  // rel
//  actual open var sizes: String = ""  // sizes
    actual open var type: String = ""  // type
}
class HTMLMapElementImpl(): HTMLMapElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMapElement: HTMLElement() {
    actual open var name: String = ""  // name
}
class HTMLMarqueeElementImpl(): HTMLMarqueeElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMarqueeElement: HTMLElement() {
    actual open var bgColor: String = ""  // bgcolor
    actual open var loop: Int = 0  // loop
}
class HTMLMenuElementImpl(): HTMLMenuElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMenuElement: HTMLElement() {
    actual open var type: String = ""  // type
}
class HTMLMetaElementImpl(): HTMLMetaElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMetaElement: HTMLElement() {
    actual open var content: String = ""  // content
    actual open var httpEquiv: String = ""  // http-equiv
    actual open var name: String = ""  // name
}
class HTMLMeterElementImpl(): HTMLMeterElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLMeterElement: HTMLElement() {
//  actual open var form: String = ""  // form
    actual open var high: Double = 0.0  // high
    actual open var low: Double = 0.0  // low
    actual open var max: Double = 0.0  // max
    actual open var min: Double = 0.0  // min
    actual open var optimum: Double = 0.0  // optimum
    actual open var value: Double = 0.0  // value
}
class HTMLObjectElementImpl(): HTMLObjectElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLObjectElement: HTMLElement() {
    actual open var border: String = ""  // border
    actual open var data: String = ""  // data
//  actual open var form: String = ""  // form
    actual open var height: String = ""  // height
    actual open var name: String = ""  // name
    actual open var type: String = ""  // type
    actual open var useMap: String = ""  // usemap
    actual open var width: String = ""  // width
}
class HTMLOListElementImpl(): HTMLOListElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLOListElement: HTMLElement() {
    actual open var reversed: Boolean = false  // reversed
    actual open var start: Int = 0  // start
    actual open var type: String = ""  // type
}
class HTMLOptGroupElementImpl(): HTMLOptGroupElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLOptGroupElement: HTMLElement() {
    actual open var disabled: Boolean = false  // disabled
    actual open var label: String = ""  // label
}
class HTMLOptionElementImpl(): HTMLOptionElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLOptionElement: HTMLElement() {
    actual open var disabled: Boolean = false  // disabled
    actual open var label: String = ""  // label
    actual open var selected: Boolean = false  // selected
    actual open var value: String = ""  // value
}
class HTMLOutputElementImpl(): HTMLOutputElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLOutputElement: HTMLElement() {
//  actual open var htmlFor: String = ""  // for
//  actual open var form: String = ""  // form
    actual open var name: String = ""  // name
}
class HTMLParamElementImpl(): HTMLParamElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLParamElement: HTMLElement() {
    actual open var name: String = ""  // name
    actual open var value: String = ""  // value
}
class HTMLProgressElementImpl(): HTMLProgressElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLProgressElement: HTMLElement() {
//  actual open var form: String = ""  // form
    actual open var max: Double = 0.0  // max
    actual open var value: Double = 0.0  // value
}
class HTMLQuoteElementImpl(): HTMLQuoteElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLQuoteElement: HTMLElement() {
    actual open var cite: String = ""  // cite
}
class HTMLScriptElementImpl(): HTMLScriptElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLScriptElement: HTMLElement() {
    actual open var async: Boolean = false  // async
    actual open var charset: String = ""  // charset
    actual open var crossOrigin: String? = null  // crossorigin
    actual open var defer: Boolean = false  // defer
//  actual open var integrity: String = ""  // integrity
//  actual open var referrerPolicy: String = ""  // referrerpolicy
    actual open var src: String = ""  // src
    actual open var type: String = ""  // type
}
class HTMLSelectElementImpl(): HTMLSelectElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLSelectElement: HTMLElement() {
    actual open var autocomplete: String = ""  // autocomplete
    actual open var autofocus: Boolean = false  // autofocus
    actual open var disabled: Boolean = false  // disabled
//  actual open var form: String = ""  // form
    actual open var multiple: Boolean = false  // multiple
    actual open var name: String = ""  // name
    actual open var required: Boolean = false  // required
    actual open var size: Int = 0  // size
}
class HTMLSourceElementImpl(): HTMLSourceElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLSourceElement: HTMLElement() {
    actual open var media: String = ""  // media
    actual open var sizes: String = ""  // sizes
    actual open var src: String = ""  // src
    actual open var srcset: String = ""  // srcset
    actual open var type: String = ""  // type
}
class HTMLStyleElementImpl(): HTMLStyleElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLStyleElement: HTMLElement() {
    actual open var media: String = ""  // media
    actual open var type: String = ""  // type
}
class HTMLTableElementImpl(): HTMLTableElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var border: String = ""  // border
    actual open var summary: String = ""  // summary
}
class HTMLTableSectionElementImpl(): HTMLTableSectionElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableSectionElement: HTMLElement() {
    actual open var align: String = ""  // align
}
class HTMLTableCellElementImpl(): HTMLTableCellElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableCellElement: HTMLElement() {
    actual open var align: String = ""  // align
    actual open var colSpan: Int = 0  // colspan
    actual open var headers: String = ""  // headers
    actual open var rowSpan: Int = 0  // rowspan
}
class HTMLTextAreaElementImpl(): HTMLTextAreaElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTextAreaElement: HTMLElement() {
    actual open var autocomplete: String = ""  // autocomplete
    actual open var autofocus: Boolean = false  // autofocus
    actual open var cols: Int = 0  // cols
    actual open var dirName: String = ""  // dirname
    actual open var disabled: Boolean = false  // disabled
//  actual open var form: String = ""  // form
    actual open var inputMode: String = ""  // inputmode
    actual open var maxLength: Int = 0  // maxlength
    actual open var minLength: Int = 0  // minlength
    actual open var name: String = ""  // name
    actual open var placeholder: String = ""  // placeholder
    actual open var readOnly: Boolean = false  // readonly
    actual open var required: Boolean = false  // required
    actual open var rows: Int = 0  // rows
    actual open var wrap: String = ""  // wrap
}
class HTMLTimeElementImpl(): HTMLTimeElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTimeElement: HTMLElement() {
    actual open var dateTime: String = ""  // datetime
}
class HTMLTableRowElementImpl(): HTMLTableRowElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTableRowElement: HTMLElement() {
    actual open var align: String = ""  // align
}
class HTMLTrackElementImpl(): HTMLTrackElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLTrackElement: HTMLElement() {
    actual open var default: Boolean = false  // default
    actual open var kind: String = ""  // kind
    actual open var label: String = ""  // label
    actual open var src: String = ""  // src
    actual open var srclang: String = ""  // srclang
}
class HTMLVideoElementImpl(): HTMLVideoElement() {
    override val style: CSSStyleDeclaration = CSSStyleDeclarationImpl()
}
actual abstract class HTMLVideoElement: HTMLMediaElement() {
//  actual open var buffered: String = ""  // buffered
    actual open var crossOrigin: String? = null  // crossorigin
    actual open var height: Int = 0  // height
    actual open var playsInline: Boolean = false  // playsinline
    actual open var poster: String = ""  // poster
    actual open var width: Int = 0  // width
}


actual inline fun HTMLElement.a(setup: HTMLAnchorElement.()->Unit): HTMLAnchorElement = HTMLAnchorElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.applet(setup: HTMLAppletElement.()->Unit): HTMLAppletElement = HTMLAppletElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.area(setup: HTMLAreaElement.()->Unit): HTMLAreaElement = HTMLAreaElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.audio(setup: HTMLAudioElement.()->Unit): HTMLAudioElement = HTMLAudioElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.base(setup: HTMLBaseElement.()->Unit): HTMLBaseElement = HTMLBaseElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.blockquote(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement = HTMLQuoteElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.body(setup: HTMLBodyElement.()->Unit): HTMLBodyElement = HTMLBodyElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.button(setup: HTMLButtonElement.()->Unit): HTMLButtonElement = HTMLButtonElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.canvas(setup: HTMLCanvasElement.()->Unit): HTMLCanvasElement = HTMLCanvasElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.caption(setup: HTMLTableCaptionElement.()->Unit): HTMLTableCaptionElement = HTMLTableCaptionElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.col(setup: HTMLTableColElement.()->Unit): HTMLTableColElement = HTMLTableColElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.data(setup: HTMLDataElement.()->Unit): HTMLDataElement = HTMLDataElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.del(setup: HTMLModElement.()->Unit): HTMLModElement = HTMLModElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.details(setup: HTMLDetailsElement.()->Unit): HTMLDetailsElement = HTMLDetailsElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.dialog(setup: HTMLDialogElement.()->Unit): HTMLDialogElement = HTMLDialogElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.embed(setup: HTMLEmbedElement.()->Unit): HTMLEmbedElement = HTMLEmbedElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.fieldset(setup: HTMLFieldSetElement.()->Unit): HTMLFieldSetElement = HTMLFieldSetElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.font(setup: HTMLFontElement.()->Unit): HTMLFontElement = HTMLFontElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.form(setup: HTMLFormElement.()->Unit): HTMLFormElement = HTMLFormElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.hr(setup: HTMLHRElement.()->Unit): HTMLHRElement = HTMLHRElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.iframe(setup: HTMLIFrameElement.()->Unit): HTMLIFrameElement = HTMLIFrameElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.img(setup: HTMLImageElement.()->Unit): HTMLImageElement = HTMLImageElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.input(setup: HTMLInputElement.()->Unit): HTMLInputElement = HTMLInputElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.ins(setup: HTMLModElement.()->Unit): HTMLModElement = HTMLModElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.keygen(setup: HTMLKeygenElement.()->Unit): HTMLKeygenElement = HTMLKeygenElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.label(setup: HTMLLabelElement.()->Unit): HTMLLabelElement = HTMLLabelElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.li(setup: HTMLLIElement.()->Unit): HTMLLIElement = HTMLLIElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.link(setup: HTMLLinkElement.()->Unit): HTMLLinkElement = HTMLLinkElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.map(setup: HTMLMapElement.()->Unit): HTMLMapElement = HTMLMapElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.marquee(setup: HTMLMarqueeElement.()->Unit): HTMLMarqueeElement = HTMLMarqueeElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.menu(setup: HTMLMenuElement.()->Unit): HTMLMenuElement = HTMLMenuElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.meta(setup: HTMLMetaElement.()->Unit): HTMLMetaElement = HTMLMetaElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.meter(setup: HTMLMeterElement.()->Unit): HTMLMeterElement = HTMLMeterElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.`object`(setup: HTMLObjectElement.()->Unit): HTMLObjectElement = HTMLObjectElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.ol(setup: HTMLOListElement.()->Unit): HTMLOListElement = HTMLOListElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.optgroup(setup: HTMLOptGroupElement.()->Unit): HTMLOptGroupElement = HTMLOptGroupElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.option(setup: HTMLOptionElement.()->Unit): HTMLOptionElement = HTMLOptionElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.output(setup: HTMLOutputElement.()->Unit): HTMLOutputElement = HTMLOutputElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.param(setup: HTMLParamElement.()->Unit): HTMLParamElement = HTMLParamElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.progress(setup: HTMLProgressElement.()->Unit): HTMLProgressElement = HTMLProgressElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.q(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement = HTMLQuoteElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.script(setup: HTMLScriptElement.()->Unit): HTMLScriptElement = HTMLScriptElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.select(setup: HTMLSelectElement.()->Unit): HTMLSelectElement = HTMLSelectElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.source(setup: HTMLSourceElement.()->Unit): HTMLSourceElement = HTMLSourceElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.style(setup: HTMLStyleElement.()->Unit): HTMLStyleElement = HTMLStyleElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.table(setup: HTMLTableElement.()->Unit): HTMLTableElement = HTMLTableElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.tbody(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = HTMLTableSectionElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.td(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement = HTMLTableCellElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.textarea(setup: HTMLTextAreaElement.()->Unit): HTMLTextAreaElement = HTMLTextAreaElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.tfoot(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = HTMLTableSectionElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.th(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement = HTMLTableCellElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.thead(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = HTMLTableSectionElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.time(setup: HTMLTimeElement.()->Unit): HTMLTimeElement = HTMLTimeElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.tr(setup: HTMLTableRowElement.()->Unit): HTMLTableRowElement = HTMLTableRowElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.track(setup: HTMLTrackElement.()->Unit): HTMLTrackElement = HTMLTrackElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.video(setup: HTMLVideoElement.()->Unit): HTMLVideoElement = HTMLVideoElementImpl().apply(setup).also { appendChild(it) }
actual inline fun HTMLElement.element(tag: String, setup: HTMLElement.()->Unit): HTMLElement = HTMLElementImpl(tag).apply(setup).also { appendChild(it) }
actual inline fun html(create: HTMLElement.() -> Unit): HTMLElement {
    return HTMLElementImpl("").apply(create).children[0] as HTMLElement
}