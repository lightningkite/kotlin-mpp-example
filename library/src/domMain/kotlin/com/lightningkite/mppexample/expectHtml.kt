package com.lightningkite.mppexample

expect abstract class CSSStyleDeclaration {
    open var cssText: String
    open var cssFloat: String
    open var alignContent: String
    open var alignItems: String
    open var alignSelf: String
    open var animation: String
    open var animationDelay: String
    open var animationDirection: String
    open var animationDuration: String
    open var animationFillMode: String
    open var animationIterationCount: String
    open var animationName: String
    open var animationPlayState: String
    open var animationTimingFunction: String
    open var backfaceVisibility: String
    open var background: String
    open var backgroundAttachment: String
    open var backgroundClip: String
    open var backgroundColor: String
    open var backgroundImage: String
    open var backgroundOrigin: String
    open var backgroundPosition: String
    open var backgroundRepeat: String
    open var backgroundSize: String
    open var border: String
    open var borderBottom: String
    open var borderBottomColor: String
    open var borderBottomLeftRadius: String
    open var borderBottomRightRadius: String
    open var borderBottomStyle: String
    open var borderBottomWidth: String
    open var borderCollapse: String
    open var borderColor: String
    open var borderImage: String
    open var borderImageOutset: String
    open var borderImageRepeat: String
    open var borderImageSlice: String
    open var borderImageSource: String
    open var borderImageWidth: String
    open var borderLeft: String
    open var borderLeftColor: String
    open var borderLeftStyle: String
    open var borderLeftWidth: String
    open var borderRadius: String
    open var borderRight: String
    open var borderRightColor: String
    open var borderRightStyle: String
    open var borderRightWidth: String
    open var borderSpacing: String
    open var borderStyle: String
    open var borderTop: String
    open var borderTopColor: String
    open var borderTopLeftRadius: String
    open var borderTopRightRadius: String
    open var borderTopStyle: String
    open var borderTopWidth: String
    open var borderWidth: String
    open var bottom: String
    open var boxDecorationBreak: String
    open var boxShadow: String
    open var boxSizing: String
    open var breakAfter: String
    open var breakBefore: String
    open var breakInside: String
    open var captionSide: String
    open var clear: String
    open var clip: String
    open var color: String
    open var columnCount: String
    open var columnFill: String
    open var columnGap: String
    open var columnRule: String
    open var columnRuleColor: String
    open var columnRuleStyle: String
    open var columnRuleWidth: String
    open var columnSpan: String
    open var columnWidth: String
    open var columns: String
    open var content: String
    open var counterIncrement: String
    open var counterReset: String
    open var cursor: String
    open var direction: String
    open var display: String
    open var emptyCells: String
    open var filter: String
    open var flex: String
    open var flexBasis: String
    open var flexDirection: String
    open var flexFlow: String
    open var flexGrow: String
    open var flexShrink: String
    open var flexWrap: String
    open var font: String
    open var fontFamily: String
    open var fontFeatureSettings: String
    open var fontKerning: String
    open var fontLanguageOverride: String
    open var fontSize: String
    open var fontSizeAdjust: String
    open var fontStretch: String
    open var fontStyle: String
    open var fontSynthesis: String
    open var fontVariant: String
    open var fontVariantAlternates: String
    open var fontVariantCaps: String
    open var fontVariantEastAsian: String
    open var fontVariantLigatures: String
    open var fontVariantNumeric: String
    open var fontVariantPosition: String
    open var fontWeight: String
    open var hangingPunctuation: String
    open var height: String
    open var hyphens: String
    open var imageOrientation: String
    open var imageRendering: String
    open var imageResolution: String
    open var imeMode: String
    open var justifyContent: String
    open var left: String
    open var letterSpacing: String
    open var lineBreak: String
    open var lineHeight: String
    open var listStyle: String
    open var listStyleImage: String
    open var listStylePosition: String
    open var listStyleType: String
    open var margin: String
    open var marginBottom: String
    open var marginLeft: String
    open var marginRight: String
    open var marginTop: String
    open var mark: String
    open var markAfter: String
    open var markBefore: String
    open var marks: String
    open var marqueeDirection: String
    open var marqueePlayCount: String
    open var marqueeSpeed: String
    open var marqueeStyle: String
    open var mask: String
    open var maskType: String
    open var maxHeight: String
    open var maxWidth: String
    open var minHeight: String
    open var minWidth: String
    open var navDown: String
    open var navIndex: String
    open var navLeft: String
    open var navRight: String
    open var navUp: String
    open var objectFit: String
    open var objectPosition: String
    open var opacity: String
    open var order: String
    open var orphans: String
    open var outline: String
    open var outlineColor: String
    open var outlineOffset: String
    open var outlineStyle: String
    open var outlineWidth: String
    open var overflowWrap: String
    open var overflowX: String
    open var overflowY: String
    open var padding: String
    open var paddingBottom: String
    open var paddingLeft: String
    open var paddingRight: String
    open var paddingTop: String
    open var pageBreakAfter: String
    open var pageBreakBefore: String
    open var pageBreakInside: String
    open var perspective: String
    open var perspectiveOrigin: String
    open var phonemes: String
    open var position: String
    open var quotes: String
    open var resize: String
    open var rest: String
    open var restAfter: String
    open var restBefore: String
    open var right: String
    open var tabSize: String
    open var tableLayout: String
    open var textAlign: String
    open var textAlignLast: String
    open var textCombineUpright: String
    open var textDecoration: String
    open var textDecorationColor: String
    open var textDecorationLine: String
    open var textDecorationStyle: String
    open var textIndent: String
    open var textJustify: String
    open var textOrientation: String
    open var textOverflow: String
    open var textShadow: String
    open var textTransform: String
    open var textUnderlinePosition: String
    open var top: String
    open var transform: String
    open var transformOrigin: String
    open var transformStyle: String
    open var transition: String
    open var transitionDelay: String
    open var transitionDuration: String
    open var transitionProperty: String
    open var transitionTimingFunction: String
    open var unicodeBidi: String
    open var verticalAlign: String
    open var visibility: String
    open var voiceBalance: String
    open var voiceDuration: String
    open var voicePitch: String
    open var voicePitchRange: String
    open var voiceRate: String
    open var voiceStress: String
    open var voiceVolume: String
    open var whiteSpace: String
    open var widows: String
    open var width: String
    open var wordBreak: String
    open var wordSpacing: String
    open var wordWrap: String
    open var writingMode: String
    open var zIndex: String
    fun getPropertyValue(property: String): String
    fun getPropertyPriority(property: String): String
    fun setProperty(property: String, value: String, priority: String)
    fun setPropertyValue(property: String, value: String)
    fun setPropertyPriority(property: String, priority: String)
    fun removeProperty(property: String): String
}

expect abstract class Node {
    fun appendChild(node: Node): Node
}
expect abstract class CharacterData: Node {}
expect open class Text(data: String): CharacterData {
    open val wholeText: String
}
expect abstract class Element: Node {
    open val tagName: String
}

expect abstract class HTMLElement: Element {
    open var accessKey: String  // accesskey
    open var className: String  // class
    open var dir: String  // dir
    open var draggable: Boolean  // draggable
    open var hidden: Boolean  // hidden
    open var id: String  // id
    open var lang: String  // lang
    open var slot: String  // slot
    open var spellcheck: Boolean  // spellcheck
    abstract val style: CSSStyleDeclaration  // style
    open var title: String  // title
    open var translate: Boolean  // translate
}

expect abstract class HTMLAnchorElement: HTMLElement {
    open var download: String  // download
    abstract var href: String  // href
    open var hreflang: String  // hreflang
    open var ping: String  // ping
    open var rel: String  // rel
    open var shape: String  // shape
    open var target: String  // target
}
expect abstract class HTMLAppletElement: HTMLElement {
    open var align: String  // align
    open var alt: String  // alt
    open var code: String  // code
}
expect abstract class HTMLAreaElement: HTMLElement {
    open var alt: String  // alt
    open var coords: String  // coords
    open var download: String  // download
    abstract var href: String  // href
    open var ping: String  // ping
    open var rel: String  // rel
    open var shape: String  // shape
    open var target: String  // target
}
expect abstract class HTMLMediaElement: HTMLElement {
    open var autoplay: Boolean  // autoplay
//    open var buffered: String  // buffered
    open var controls: Boolean  // controls
    open var loop: Boolean  // loop
    open var muted: Boolean  // muted
    open var preload: String  // preload
    open var src: String  // src
}
expect abstract class HTMLAudioElement: HTMLMediaElement {
}
expect abstract class HTMLBaseElement: HTMLElement {
    open var href: String  // href
    open var target: String  // target
}
expect abstract class HTMLBodyElement: HTMLElement {
    open var background: String  // background
}
expect abstract class HTMLButtonElement: HTMLElement {
//    open var autofocus: String  // autofocus
    open var disabled: Boolean  // disabled
//    open var form: String  // form
    open var formAction: String  // formaction
    open var formEnctype: String  // formenctype
    open var formMethod: String  // formmethod
    open var formNoValidate: Boolean  // formnovalidate
    open var formTarget: String  // formtarget
    open var name: String  // name
    open var type: String  // type
    open var value: String  // value
}
expect abstract class HTMLCanvasElement: HTMLElement {
    open var height: Int  // height
    open var width: Int  // width
}
expect abstract class HTMLTableCaptionElement: HTMLElement {
    open var align: String  // align
}
expect abstract class HTMLTableColElement: HTMLElement {
    open var align: String  // align
    open var span: Int  // span
}
expect abstract class HTMLDataElement: HTMLElement {
    open var value: String  // value
}
expect abstract class HTMLModElement: HTMLElement {
    open var cite: String  // cite
    open var dateTime: String  // datetime
}
expect abstract class HTMLDetailsElement: HTMLElement {
    open var open: Boolean  // open
}
expect abstract class HTMLDialogElement: HTMLElement {
    open var open: Boolean  // open
}
expect abstract class HTMLEmbedElement: HTMLElement {
    open var height: String  // height
    open var src: String  // src
    open var type: String  // type
    open var width: String  // width
}
expect abstract class HTMLFieldSetElement: HTMLElement {
    open var disabled: Boolean  // disabled
//    open var form: String  // form
    open var name: String  // name
}
expect abstract class HTMLFontElement: HTMLElement {
    open var color: String  // color
}
expect abstract class HTMLFormElement: HTMLElement {
    open var acceptCharset: String  // accept-charset
    open var action: String  // action
    open var autocomplete: String  // autocomplete
    open var enctype: String  // enctype
    open var method: String  // method
    open var name: String  // name
    open var noValidate: Boolean  // novalidate
    open var target: String  // target
}
expect abstract class HTMLHRElement: HTMLElement {
    open var align: String  // align
    open var color: String  // color
}
expect abstract class HTMLIFrameElement: HTMLElement {
    open var align: String  // align
//    open var allow: String  // allow
//    open var csp: String  // csp Experimental
    open var height: String  // height
//    open var loading: String  // loading Experimental
    open var name: String  // name
//    open var referrerpolicy: String  // referrerpolicy
//    open var sandbox: String  // sandbox
    open var src: String  // src
    open var srcdoc: String  // srcdoc
    open var width: String  // width
}
expect abstract class HTMLImageElement: HTMLElement {
    open var align: String  // align
    open var alt: String  // alt
    open var border: String  // border
    open var height: Int  // height
    open var isMap: Boolean  // ismap
//    open var loading: String  // loading Experimental
//    open var referrerpolicy: String  // referrerpolicy
    open var sizes: String  // sizes
    open var src: String  // src
    open var srcset: String  // srcset
    open var useMap: String  // usemap
    open var width: Int  // width
}
expect abstract class HTMLInputElement: HTMLElement {
    open var accept: String  // accept
    open var alt: String  // alt
    open var autocomplete: String  // autocomplete
    open var autofocus: Boolean  // autofocus
    open var checked: Boolean  // checked
    open var dirName: String  // dirname
    open var disabled: Boolean  // disabled
    //    open var form: String  // form
    open var formAction: String  // formaction
    open var formEnctype: String  // formenctype
    open var formMethod: String  // formmethod
    open var formNoValidate: Boolean  // formnovalidate
    open var formTarget: String  // formtarget
    open var height: Int  // height
    //    open var list: String  // list
    open var max: String  // max
    open var maxLength: Int  // maxlength
    open var minLength: Int  // minlength
    open var min: String  // min
    open var multiple: Boolean  // multiple
    open var name: String  // name
    open var pattern: String  // pattern
    open var placeholder: String  // placeholder
    open var readOnly: Boolean  // readonly
    open var required: Boolean  // required
    open var size: Int  // size
    open var src: String  // src
    open var step: String  // step
    open var type: String  // type
    open var useMap: String  // usemap
    open var value: String  // value
    open var width: Int  // width
}
expect abstract class HTMLKeygenElement: HTMLElement {
    open var autofocus: Boolean  // autofocus
    open var challenge: String  // challenge
    open var disabled: Boolean  // disabled
//    open var form: String  // form
    open var keytype: String  // keytype
    open var name: String  // name
}
expect abstract class HTMLLabelElement: HTMLElement {
    open var htmlFor: String  // for
//    open var form: String  // form
}
expect abstract class HTMLLIElement: HTMLElement {
    open var value: Int  // value
}
expect abstract class HTMLLinkElement: HTMLElement {
    open var crossOrigin: String?  // crossorigin
    open var href: String  // href
    open var hreflang: String  // hreflang
    open var media: String  // media
    open var referrerPolicy: String  // referrerpolicy
    open var rel: String  // rel
//    open var sizes: String  // sizes
    open var type: String  // type
}
expect abstract class HTMLMapElement: HTMLElement {
    open var name: String  // name
}
expect abstract class HTMLMarqueeElement: HTMLElement {
    open var bgColor: String  // bgcolor
    open var loop: Int  // loop
}
expect abstract class HTMLMenuElement: HTMLElement {
    open var type: String  // type
}
expect abstract class HTMLMetaElement: HTMLElement {
    open var content: String  // content
    open var httpEquiv: String  // http-equiv
    open var name: String  // name
}
expect abstract class HTMLMeterElement: HTMLElement {
//    open var form: String  // form
    open var high: Double  // high
    open var low: Double  // low
    open var max: Double  // max
    open var min: Double  // min
    open var optimum: Double  // optimum
    open var value: Double  // value
}
expect abstract class HTMLObjectElement: HTMLElement {
    open var border: String  // border
    open var data: String  // data
//    open var form: String  // form
    open var height: String  // height
    open var name: String  // name
    open var type: String  // type
    open var useMap: String  // usemap
    open var width: String  // width
}
expect abstract class HTMLOListElement: HTMLElement {
    open var reversed: Boolean  // reversed
    open var start: Int  // start
    open var type: String  // type
}
expect abstract class HTMLOptGroupElement: HTMLElement {
    open var disabled: Boolean  // disabled
    open var label: String  // label
}
expect abstract class HTMLOptionElement: HTMLElement {
    open var disabled: Boolean  // disabled
    open var label: String  // label
    open var selected: Boolean  // selected
    open var value: String  // value
}
expect abstract class HTMLOutputElement: HTMLElement {
//    open var htmlFor: String  // for
//    open var form: String  // form
    open var name: String  // name
}
expect abstract class HTMLParamElement: HTMLElement {
    open var name: String  // name
    open var value: String  // value
}
expect abstract class HTMLProgressElement: HTMLElement {
//    open var form: String  // form
    open var max: Double  // max
    open var value: Double  // value
}
expect abstract class HTMLQuoteElement: HTMLElement {
    open var cite: String  // cite
}
expect abstract class HTMLScriptElement: HTMLElement {
    open var async: Boolean  // async
    open var charset: String  // charset
    open var crossOrigin: String?  // crossorigin
    open var defer: Boolean  // defer
//    open var integrity: String  // integrity
//    open var referrerPolicy: String  // referrerpolicy
    open var src: String  // src
    open var type: String  // type
}
expect abstract class HTMLSelectElement: HTMLElement {
    open var autocomplete: String  // autocomplete
    open var autofocus: Boolean  // autofocus
    open var disabled: Boolean  // disabled
//    open var form: String  // form
    open var multiple: Boolean  // multiple
    open var name: String  // name
    open var required: Boolean  // required
    open var size: Int  // size
}
expect abstract class HTMLSourceElement: HTMLElement {
    open var media: String  // media
    open var sizes: String  // sizes
    open var src: String  // src
    open var srcset: String  // srcset
    open var type: String  // type
}
expect abstract class HTMLStyleElement: HTMLElement {
    open var media: String  // media
    open var type: String  // type
}
expect abstract class HTMLTableElement: HTMLElement {
    open var align: String  // align
    open var border: String  // border
    open var summary: String  // summary
}
expect abstract class HTMLTableSectionElement: HTMLElement {
    open var align: String  // align
}
expect abstract class HTMLTableCellElement: HTMLElement {
    open var align: String  // align
    open var colSpan: Int  // colspan
    open var headers: String  // headers
    open var rowSpan: Int  // rowspan
}
expect abstract class HTMLTextAreaElement: HTMLElement {
    open var autocomplete: String  // autocomplete
    open var autofocus: Boolean  // autofocus
    open var cols: Int  // cols
    open var dirName: String  // dirname
    open var disabled: Boolean  // disabled
//    open var form: String  // form
    open var inputMode: String  // inputmode
    open var maxLength: Int  // maxlength
    open var minLength: Int  // minlength
    open var name: String  // name
    open var placeholder: String  // placeholder
    open var readOnly: Boolean  // readonly
    open var required: Boolean  // required
    open var rows: Int  // rows
    open var wrap: String  // wrap
}
expect abstract class HTMLTimeElement: HTMLElement {
    open var dateTime: String  // datetime
}
expect abstract class HTMLTableRowElement: HTMLElement {
    open var align: String  // align
}
expect abstract class HTMLTrackElement: HTMLElement {
    open var default: Boolean  // default
    open var kind: String  // kind
    open var label: String  // label
    open var src: String  // src
    open var srclang: String  // srclang
}
expect abstract class HTMLVideoElement: HTMLMediaElement {
//    open var buffered: String  // buffered
    open var crossOrigin: String?  // crossorigin
    open var height: Int  // height
    open var playsInline: Boolean  // playsinline
    open var poster: String  // poster
    open var width: Int  // width
}

// HTML factory stuff
//  We need to be able to both create element and merge existing elements.
//  For that to work with this system, we need to be able to reset all the properties.
//  That... does not seem viable.  Hmm.
//  SSR
//  We don't need to worry about property reset - we expect things to match anyways, statewise.
//  We just need to match up corresponding elements and patch the missing ones.
//  Therefore, the view factory needs to merge.
//  We know the only static things.  We need to tag the lazy's perhaps to make sure the merge goes smoothly.
//  Lazy's are gonna be rare enough straight replace is probably fine.

/*iijkjimjj

div {
    p {
        text("asdf")
    }
}

*/

interface HtmlFactory {
    fun <T: HTMLElement> element(tagName: String): T
    fun text(text: String)
    fun exitElement()
}

inline fun HtmlFactory.a(setup: HTMLAnchorElement.()->Unit): HTMLAnchorElement = element<HTMLAnchorElement>("a").apply(setup).also { exitElement() }
inline fun HtmlFactory.applet(setup: HTMLAppletElement.()->Unit): HTMLAppletElement = element<HTMLAppletElement>("applet").apply(setup).also { exitElement() }
inline fun HtmlFactory.area(setup: HTMLAreaElement.()->Unit): HTMLAreaElement = element<HTMLAreaElement>("area").apply(setup).also { exitElement() }
inline fun HtmlFactory.audio(setup: HTMLAudioElement.()->Unit): HTMLAudioElement = element<HTMLAudioElement>("audio").apply(setup).also { exitElement() }
inline fun HtmlFactory.base(setup: HTMLBaseElement.()->Unit): HTMLBaseElement = element<HTMLBaseElement>("base").apply(setup).also { exitElement() }
inline fun HtmlFactory.blockquote(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement = element<HTMLQuoteElement>("blockquote").apply(setup).also { exitElement() }
inline fun HtmlFactory.body(setup: HTMLBodyElement.()->Unit): HTMLBodyElement = element<HTMLBodyElement>("body").apply(setup).also { exitElement() }
inline fun HtmlFactory.button(setup: HTMLButtonElement.()->Unit): HTMLButtonElement = element<HTMLButtonElement>("button").apply(setup).also { exitElement() }
inline fun HtmlFactory.canvas(setup: HTMLCanvasElement.()->Unit): HTMLCanvasElement = element<HTMLCanvasElement>("canvas").apply(setup).also { exitElement() }
inline fun HtmlFactory.caption(setup: HTMLTableCaptionElement.()->Unit): HTMLTableCaptionElement = element<HTMLTableCaptionElement>("caption").apply(setup).also { exitElement() }
inline fun HtmlFactory.col(setup: HTMLTableColElement.()->Unit): HTMLTableColElement = element<HTMLTableColElement>("col").apply(setup).also { exitElement() }
inline fun HtmlFactory.data(setup: HTMLDataElement.()->Unit): HTMLDataElement = element<HTMLDataElement>("data").apply(setup).also { exitElement() }
inline fun HtmlFactory.del(setup: HTMLModElement.()->Unit): HTMLModElement = element<HTMLModElement>("del").apply(setup).also { exitElement() }
inline fun HtmlFactory.details(setup: HTMLDetailsElement.()->Unit): HTMLDetailsElement = element<HTMLDetailsElement>("details").apply(setup).also { exitElement() }
inline fun HtmlFactory.dialog(setup: HTMLDialogElement.()->Unit): HTMLDialogElement = element<HTMLDialogElement>("dialog").apply(setup).also { exitElement() }
inline fun HtmlFactory.embed(setup: HTMLEmbedElement.()->Unit): HTMLEmbedElement = element<HTMLEmbedElement>("embed").apply(setup).also { exitElement() }
inline fun HtmlFactory.fieldset(setup: HTMLFieldSetElement.()->Unit): HTMLFieldSetElement = element<HTMLFieldSetElement>("fieldset").apply(setup).also { exitElement() }
inline fun HtmlFactory.font(setup: HTMLFontElement.()->Unit): HTMLFontElement = element<HTMLFontElement>("font").apply(setup).also { exitElement() }
inline fun HtmlFactory.form(setup: HTMLFormElement.()->Unit): HTMLFormElement = element<HTMLFormElement>("form").apply(setup).also { exitElement() }
inline fun HtmlFactory.hr(setup: HTMLHRElement.()->Unit): HTMLHRElement = element<HTMLHRElement>("hr").apply(setup).also { exitElement() }
inline fun HtmlFactory.iframe(setup: HTMLIFrameElement.()->Unit): HTMLIFrameElement = element<HTMLIFrameElement>("iframe").apply(setup).also { exitElement() }
inline fun HtmlFactory.img(setup: HTMLImageElement.()->Unit): HTMLImageElement = element<HTMLImageElement>("img").apply(setup).also { exitElement() }
inline fun HtmlFactory.input(setup: HTMLInputElement.()->Unit): HTMLInputElement = element<HTMLInputElement>("input").apply(setup).also { exitElement() }
inline fun HtmlFactory.ins(setup: HTMLModElement.()->Unit): HTMLModElement = element<HTMLModElement>("ins").apply(setup).also { exitElement() }
inline fun HtmlFactory.keygen(setup: HTMLKeygenElement.()->Unit): HTMLKeygenElement = element<HTMLKeygenElement>("keygen").apply(setup).also { exitElement() }
inline fun HtmlFactory.label(setup: HTMLLabelElement.()->Unit): HTMLLabelElement = element<HTMLLabelElement>("label").apply(setup).also { exitElement() }
inline fun HtmlFactory.li(setup: HTMLLIElement.()->Unit): HTMLLIElement = element<HTMLLIElement>("li").apply(setup).also { exitElement() }
inline fun HtmlFactory.link(setup: HTMLLinkElement.()->Unit): HTMLLinkElement = element<HTMLLinkElement>("link").apply(setup).also { exitElement() }
inline fun HtmlFactory.map(setup: HTMLMapElement.()->Unit): HTMLMapElement = element<HTMLMapElement>("map").apply(setup).also { exitElement() }
inline fun HtmlFactory.marquee(setup: HTMLMarqueeElement.()->Unit): HTMLMarqueeElement = element<HTMLMarqueeElement>("marquee").apply(setup).also { exitElement() }
inline fun HtmlFactory.menu(setup: HTMLMenuElement.()->Unit): HTMLMenuElement = element<HTMLMenuElement>("menu").apply(setup).also { exitElement() }
inline fun HtmlFactory.meta(setup: HTMLMetaElement.()->Unit): HTMLMetaElement = element<HTMLMetaElement>("meta").apply(setup).also { exitElement() }
inline fun HtmlFactory.meter(setup: HTMLMeterElement.()->Unit): HTMLMeterElement = element<HTMLMeterElement>("meter").apply(setup).also { exitElement() }
inline fun HtmlFactory.`object`(setup: HTMLObjectElement.()->Unit): HTMLObjectElement = element<HTMLObjectElement>("object").apply(setup).also { exitElement() }
inline fun HtmlFactory.ol(setup: HTMLOListElement.()->Unit): HTMLOListElement = element<HTMLOListElement>("ol").apply(setup).also { exitElement() }
inline fun HtmlFactory.optgroup(setup: HTMLOptGroupElement.()->Unit): HTMLOptGroupElement = element<HTMLOptGroupElement>("optgroup").apply(setup).also { exitElement() }
inline fun HtmlFactory.option(setup: HTMLOptionElement.()->Unit): HTMLOptionElement = element<HTMLOptionElement>("option").apply(setup).also { exitElement() }
inline fun HtmlFactory.output(setup: HTMLOutputElement.()->Unit): HTMLOutputElement = element<HTMLOutputElement>("output").apply(setup).also { exitElement() }
inline fun HtmlFactory.param(setup: HTMLParamElement.()->Unit): HTMLParamElement = element<HTMLParamElement>("param").apply(setup).also { exitElement() }
inline fun HtmlFactory.progress(setup: HTMLProgressElement.()->Unit): HTMLProgressElement = element<HTMLProgressElement>("progress").apply(setup).also { exitElement() }
inline fun HtmlFactory.q(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement = element<HTMLQuoteElement>("q").apply(setup).also { exitElement() }
inline fun HtmlFactory.script(setup: HTMLScriptElement.()->Unit): HTMLScriptElement = element<HTMLScriptElement>("script").apply(setup).also { exitElement() }
inline fun HtmlFactory.select(setup: HTMLSelectElement.()->Unit): HTMLSelectElement = element<HTMLSelectElement>("select").apply(setup).also { exitElement() }
inline fun HtmlFactory.source(setup: HTMLSourceElement.()->Unit): HTMLSourceElement = element<HTMLSourceElement>("source").apply(setup).also { exitElement() }
inline fun HtmlFactory.style(setup: HTMLStyleElement.()->Unit): HTMLStyleElement = element<HTMLStyleElement>("style").apply(setup).also { exitElement() }
inline fun HtmlFactory.table(setup: HTMLTableElement.()->Unit): HTMLTableElement = element<HTMLTableElement>("table").apply(setup).also { exitElement() }
inline fun HtmlFactory.tbody(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = element<HTMLTableSectionElement>("tbody").apply(setup).also { exitElement() }
inline fun HtmlFactory.td(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement = element<HTMLTableCellElement>("td").apply(setup).also { exitElement() }
inline fun HtmlFactory.textarea(setup: HTMLTextAreaElement.()->Unit): HTMLTextAreaElement = element<HTMLTextAreaElement>("textarea").apply(setup).also { exitElement() }
inline fun HtmlFactory.tfoot(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = element<HTMLTableSectionElement>("tfoot").apply(setup).also { exitElement() }
inline fun HtmlFactory.th(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement = element<HTMLTableCellElement>("th").apply(setup).also { exitElement() }
inline fun HtmlFactory.thead(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement = element<HTMLTableSectionElement>("thead").apply(setup).also { exitElement() }
inline fun HtmlFactory.time(setup: HTMLTimeElement.()->Unit): HTMLTimeElement = element<HTMLTimeElement>("time").apply(setup).also { exitElement() }
inline fun HtmlFactory.tr(setup: HTMLTableRowElement.()->Unit): HTMLTableRowElement = element<HTMLTableRowElement>("tr").apply(setup).also { exitElement() }
inline fun HtmlFactory.track(setup: HTMLTrackElement.()->Unit): HTMLTrackElement = element<HTMLTrackElement>("track").apply(setup).also { exitElement() }
inline fun HtmlFactory.video(setup: HTMLVideoElement.()->Unit): HTMLVideoElement = element<HTMLVideoElement>("video").apply(setup).also { exitElement() }

inline fun HtmlFactory.abbr(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("abbr").apply(setup).also { exitElement() }
inline fun HtmlFactory.acronym(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("acronym").apply(setup).also { exitElement() }
inline fun HtmlFactory.address(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("address").apply(setup).also { exitElement() }
inline fun HtmlFactory.article(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("article").apply(setup).also { exitElement() }
inline fun HtmlFactory.aside(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("aside").apply(setup).also { exitElement() }
inline fun HtmlFactory.b(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("b").apply(setup).also { exitElement() }
inline fun HtmlFactory.basefont(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("basefont").apply(setup).also { exitElement() }
inline fun HtmlFactory.bdi(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("bdi").apply(setup).also { exitElement() }
inline fun HtmlFactory.bdo(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("bdo").apply(setup).also { exitElement() }
inline fun HtmlFactory.big(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("big").apply(setup).also { exitElement() }
inline fun HtmlFactory.br(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("br").apply(setup).also { exitElement() }
inline fun HtmlFactory.center(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("center").apply(setup).also { exitElement() }
inline fun HtmlFactory.cite(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("cite").apply(setup).also { exitElement() }
inline fun HtmlFactory.code(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("code").apply(setup).also { exitElement() }
inline fun HtmlFactory.colgroup(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("colgroup").apply(setup).also { exitElement() }
inline fun HtmlFactory.datalist(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("datalist").apply(setup).also { exitElement() }
inline fun HtmlFactory.dd(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("dd").apply(setup).also { exitElement() }
inline fun HtmlFactory.dfn(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("dfn").apply(setup).also { exitElement() }
inline fun HtmlFactory.dir(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("dir").apply(setup).also { exitElement() }
inline fun HtmlFactory.div(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("div").apply(setup).also { exitElement() }
inline fun HtmlFactory.dl(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("dl").apply(setup).also { exitElement() }
inline fun HtmlFactory.dt(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("dt").apply(setup).also { exitElement() }
inline fun HtmlFactory.em(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("em").apply(setup).also { exitElement() }
inline fun HtmlFactory.figcaption(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("figcaption").apply(setup).also { exitElement() }
inline fun HtmlFactory.figure(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("figure").apply(setup).also { exitElement() }
inline fun HtmlFactory.footer(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("footer").apply(setup).also { exitElement() }
inline fun HtmlFactory.frame(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("frame").apply(setup).also { exitElement() }
inline fun HtmlFactory.frameset(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("frameset").apply(setup).also { exitElement() }
inline fun HtmlFactory.h1(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h1").apply(setup).also { exitElement() }
inline fun HtmlFactory.h2(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h2").apply(setup).also { exitElement() }
inline fun HtmlFactory.h3(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h3").apply(setup).also { exitElement() }
inline fun HtmlFactory.h4(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h4").apply(setup).also { exitElement() }
inline fun HtmlFactory.h5(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h5").apply(setup).also { exitElement() }
inline fun HtmlFactory.h6(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("h6").apply(setup).also { exitElement() }
inline fun HtmlFactory.head(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("head").apply(setup).also { exitElement() }
inline fun HtmlFactory.header(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("header").apply(setup).also { exitElement() }
inline fun HtmlFactory.html(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("html").apply(setup).also { exitElement() }
inline fun HtmlFactory.i(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("i").apply(setup).also { exitElement() }
inline fun HtmlFactory.kbd(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("kbd").apply(setup).also { exitElement() }
inline fun HtmlFactory.legend(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("legend").apply(setup).also { exitElement() }
inline fun HtmlFactory.main(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("main").apply(setup).also { exitElement() }
inline fun HtmlFactory.mark(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("mark").apply(setup).also { exitElement() }
inline fun HtmlFactory.nav(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("nav").apply(setup).also { exitElement() }
inline fun HtmlFactory.noframes(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("noframes").apply(setup).also { exitElement() }
inline fun HtmlFactory.noscript(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("noscript").apply(setup).also { exitElement() }
inline fun HtmlFactory.p(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("p").apply(setup).also { exitElement() }
inline fun HtmlFactory.picture(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("picture").apply(setup).also { exitElement() }
inline fun HtmlFactory.pre(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("pre").apply(setup).also { exitElement() }
inline fun HtmlFactory.rp(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("rp").apply(setup).also { exitElement() }
inline fun HtmlFactory.rt(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("rt").apply(setup).also { exitElement() }
inline fun HtmlFactory.ruby(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("ruby").apply(setup).also { exitElement() }
inline fun HtmlFactory.s(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("s").apply(setup).also { exitElement() }
inline fun HtmlFactory.samp(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("samp").apply(setup).also { exitElement() }
inline fun HtmlFactory.section(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("section").apply(setup).also { exitElement() }
inline fun HtmlFactory.small(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("small").apply(setup).also { exitElement() }
inline fun HtmlFactory.span(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("span").apply(setup).also { exitElement() }
inline fun HtmlFactory.strike(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("strike").apply(setup).also { exitElement() }
inline fun HtmlFactory.strong(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("strong").apply(setup).also { exitElement() }
inline fun HtmlFactory.sub(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("sub").apply(setup).also { exitElement() }
inline fun HtmlFactory.summary(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("summary").apply(setup).also { exitElement() }
inline fun HtmlFactory.sup(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("sup").apply(setup).also { exitElement() }
inline fun HtmlFactory.svg(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("svg").apply(setup).also { exitElement() }
inline fun HtmlFactory.template(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("template").apply(setup).also { exitElement() }
inline fun HtmlFactory.title(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("title").apply(setup).also { exitElement() }
inline fun HtmlFactory.tt(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("tt").apply(setup).also { exitElement() }
inline fun HtmlFactory.u(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("u").apply(setup).also { exitElement() }
inline fun HtmlFactory.ul(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("ul").apply(setup).also { exitElement() }
inline fun HtmlFactory.`var`(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("var").apply(setup).also { exitElement() }
inline fun HtmlFactory.wbr(setup: HTMLElement.()->Unit): HTMLElement = element<HTMLElement>("wbr").apply(setup).also { exitElement() }
