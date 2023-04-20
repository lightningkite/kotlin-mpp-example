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
expect abstract class Element: Node {}

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

expect inline fun html(create: HTMLElement.()->Unit): HTMLElement

expect inline fun HTMLElement.a(setup: HTMLAnchorElement.()->Unit): HTMLAnchorElement
expect inline fun HTMLElement.applet(setup: HTMLAppletElement.()->Unit): HTMLAppletElement
expect inline fun HTMLElement.area(setup: HTMLAreaElement.()->Unit): HTMLAreaElement
expect inline fun HTMLElement.audio(setup: HTMLAudioElement.()->Unit): HTMLAudioElement
expect inline fun HTMLElement.base(setup: HTMLBaseElement.()->Unit): HTMLBaseElement
expect inline fun HTMLElement.blockquote(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement
expect inline fun HTMLElement.body(setup: HTMLBodyElement.()->Unit): HTMLBodyElement
expect inline fun HTMLElement.button(setup: HTMLButtonElement.()->Unit): HTMLButtonElement
expect inline fun HTMLElement.canvas(setup: HTMLCanvasElement.()->Unit): HTMLCanvasElement
expect inline fun HTMLElement.caption(setup: HTMLTableCaptionElement.()->Unit): HTMLTableCaptionElement
expect inline fun HTMLElement.col(setup: HTMLTableColElement.()->Unit): HTMLTableColElement
expect inline fun HTMLElement.data(setup: HTMLDataElement.()->Unit): HTMLDataElement
expect inline fun HTMLElement.del(setup: HTMLModElement.()->Unit): HTMLModElement
expect inline fun HTMLElement.details(setup: HTMLDetailsElement.()->Unit): HTMLDetailsElement
expect inline fun HTMLElement.dialog(setup: HTMLDialogElement.()->Unit): HTMLDialogElement
expect inline fun HTMLElement.embed(setup: HTMLEmbedElement.()->Unit): HTMLEmbedElement
expect inline fun HTMLElement.fieldset(setup: HTMLFieldSetElement.()->Unit): HTMLFieldSetElement
expect inline fun HTMLElement.font(setup: HTMLFontElement.()->Unit): HTMLFontElement
expect inline fun HTMLElement.form(setup: HTMLFormElement.()->Unit): HTMLFormElement
expect inline fun HTMLElement.hr(setup: HTMLHRElement.()->Unit): HTMLHRElement
expect inline fun HTMLElement.iframe(setup: HTMLIFrameElement.()->Unit): HTMLIFrameElement
expect inline fun HTMLElement.img(setup: HTMLImageElement.()->Unit): HTMLImageElement
expect inline fun HTMLElement.input(setup: HTMLInputElement.()->Unit): HTMLInputElement
expect inline fun HTMLElement.ins(setup: HTMLModElement.()->Unit): HTMLModElement
expect inline fun HTMLElement.keygen(setup: HTMLKeygenElement.()->Unit): HTMLKeygenElement
expect inline fun HTMLElement.label(setup: HTMLLabelElement.()->Unit): HTMLLabelElement
expect inline fun HTMLElement.li(setup: HTMLLIElement.()->Unit): HTMLLIElement
expect inline fun HTMLElement.link(setup: HTMLLinkElement.()->Unit): HTMLLinkElement
expect inline fun HTMLElement.map(setup: HTMLMapElement.()->Unit): HTMLMapElement
expect inline fun HTMLElement.marquee(setup: HTMLMarqueeElement.()->Unit): HTMLMarqueeElement
expect inline fun HTMLElement.menu(setup: HTMLMenuElement.()->Unit): HTMLMenuElement
expect inline fun HTMLElement.meta(setup: HTMLMetaElement.()->Unit): HTMLMetaElement
expect inline fun HTMLElement.meter(setup: HTMLMeterElement.()->Unit): HTMLMeterElement
expect inline fun HTMLElement.`object`(setup: HTMLObjectElement.()->Unit): HTMLObjectElement
expect inline fun HTMLElement.ol(setup: HTMLOListElement.()->Unit): HTMLOListElement
expect inline fun HTMLElement.optgroup(setup: HTMLOptGroupElement.()->Unit): HTMLOptGroupElement
expect inline fun HTMLElement.option(setup: HTMLOptionElement.()->Unit): HTMLOptionElement
expect inline fun HTMLElement.output(setup: HTMLOutputElement.()->Unit): HTMLOutputElement
expect inline fun HTMLElement.param(setup: HTMLParamElement.()->Unit): HTMLParamElement
expect inline fun HTMLElement.progress(setup: HTMLProgressElement.()->Unit): HTMLProgressElement
expect inline fun HTMLElement.q(setup: HTMLQuoteElement.()->Unit): HTMLQuoteElement
expect inline fun HTMLElement.script(setup: HTMLScriptElement.()->Unit): HTMLScriptElement
expect inline fun HTMLElement.select(setup: HTMLSelectElement.()->Unit): HTMLSelectElement
expect inline fun HTMLElement.source(setup: HTMLSourceElement.()->Unit): HTMLSourceElement
expect inline fun HTMLElement.style(setup: HTMLStyleElement.()->Unit): HTMLStyleElement
expect inline fun HTMLElement.table(setup: HTMLTableElement.()->Unit): HTMLTableElement
expect inline fun HTMLElement.tbody(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement
expect inline fun HTMLElement.td(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement
expect inline fun HTMLElement.textarea(setup: HTMLTextAreaElement.()->Unit): HTMLTextAreaElement
expect inline fun HTMLElement.tfoot(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement
expect inline fun HTMLElement.th(setup: HTMLTableCellElement.()->Unit): HTMLTableCellElement
expect inline fun HTMLElement.thead(setup: HTMLTableSectionElement.()->Unit): HTMLTableSectionElement
expect inline fun HTMLElement.time(setup: HTMLTimeElement.()->Unit): HTMLTimeElement
expect inline fun HTMLElement.tr(setup: HTMLTableRowElement.()->Unit): HTMLTableRowElement
expect inline fun HTMLElement.track(setup: HTMLTrackElement.()->Unit): HTMLTrackElement
expect inline fun HTMLElement.video(setup: HTMLVideoElement.()->Unit): HTMLVideoElement

expect inline fun HTMLElement.element(tag: String, setup: HTMLElement.()->Unit): HTMLElement
inline fun HTMLElement.abbr(setup: HTMLElement.()->Unit): HTMLElement = element("abbr", setup)
inline fun HTMLElement.acronym(setup: HTMLElement.()->Unit): HTMLElement = element("acronym", setup)
inline fun HTMLElement.address(setup: HTMLElement.()->Unit): HTMLElement = element("address", setup)
inline fun HTMLElement.article(setup: HTMLElement.()->Unit): HTMLElement = element("article", setup)
inline fun HTMLElement.aside(setup: HTMLElement.()->Unit): HTMLElement = element("aside", setup)
inline fun HTMLElement.b(setup: HTMLElement.()->Unit): HTMLElement = element("b", setup)
inline fun HTMLElement.basefont(setup: HTMLElement.()->Unit): HTMLElement = element("basefont", setup)
inline fun HTMLElement.bdi(setup: HTMLElement.()->Unit): HTMLElement = element("bdi", setup)
inline fun HTMLElement.bdo(setup: HTMLElement.()->Unit): HTMLElement = element("bdo", setup)
inline fun HTMLElement.big(setup: HTMLElement.()->Unit): HTMLElement = element("big", setup)
inline fun HTMLElement.br(setup: HTMLElement.()->Unit): HTMLElement = element("br", setup)
inline fun HTMLElement.center(setup: HTMLElement.()->Unit): HTMLElement = element("center", setup)
inline fun HTMLElement.cite(setup: HTMLElement.()->Unit): HTMLElement = element("cite", setup)
inline fun HTMLElement.code(setup: HTMLElement.()->Unit): HTMLElement = element("code", setup)
inline fun HTMLElement.colgroup(setup: HTMLElement.()->Unit): HTMLElement = element("colgroup", setup)
inline fun HTMLElement.datalist(setup: HTMLElement.()->Unit): HTMLElement = element("datalist", setup)
inline fun HTMLElement.dd(setup: HTMLElement.()->Unit): HTMLElement = element("dd", setup)
inline fun HTMLElement.dfn(setup: HTMLElement.()->Unit): HTMLElement = element("dfn", setup)
inline fun HTMLElement.dir(setup: HTMLElement.()->Unit): HTMLElement = element("dir", setup)
inline fun HTMLElement.div(setup: HTMLElement.()->Unit): HTMLElement = element("div", setup)
inline fun HTMLElement.dl(setup: HTMLElement.()->Unit): HTMLElement = element("dl", setup)
inline fun HTMLElement.dt(setup: HTMLElement.()->Unit): HTMLElement = element("dt", setup)
inline fun HTMLElement.em(setup: HTMLElement.()->Unit): HTMLElement = element("em", setup)
inline fun HTMLElement.figcaption(setup: HTMLElement.()->Unit): HTMLElement = element("figcaption", setup)
inline fun HTMLElement.figure(setup: HTMLElement.()->Unit): HTMLElement = element("figure", setup)
inline fun HTMLElement.footer(setup: HTMLElement.()->Unit): HTMLElement = element("footer", setup)
inline fun HTMLElement.frame(setup: HTMLElement.()->Unit): HTMLElement = element("frame", setup)
inline fun HTMLElement.frameset(setup: HTMLElement.()->Unit): HTMLElement = element("frameset", setup)
inline fun HTMLElement.h1(setup: HTMLElement.()->Unit): HTMLElement = element("h1", setup)
inline fun HTMLElement.h2(setup: HTMLElement.()->Unit): HTMLElement = element("h2", setup)
inline fun HTMLElement.h3(setup: HTMLElement.()->Unit): HTMLElement = element("h3", setup)
inline fun HTMLElement.h4(setup: HTMLElement.()->Unit): HTMLElement = element("h4", setup)
inline fun HTMLElement.h5(setup: HTMLElement.()->Unit): HTMLElement = element("h5", setup)
inline fun HTMLElement.h6(setup: HTMLElement.()->Unit): HTMLElement = element("h6", setup)
inline fun HTMLElement.head(setup: HTMLElement.()->Unit): HTMLElement = element("head", setup)
inline fun HTMLElement.header(setup: HTMLElement.()->Unit): HTMLElement = element("header", setup)
inline fun HTMLElement.html(setup: HTMLElement.()->Unit): HTMLElement = element("html", setup)
inline fun HTMLElement.i(setup: HTMLElement.()->Unit): HTMLElement = element("i", setup)
inline fun HTMLElement.kbd(setup: HTMLElement.()->Unit): HTMLElement = element("kbd", setup)
inline fun HTMLElement.legend(setup: HTMLElement.()->Unit): HTMLElement = element("legend", setup)
inline fun HTMLElement.main(setup: HTMLElement.()->Unit): HTMLElement = element("main", setup)
inline fun HTMLElement.mark(setup: HTMLElement.()->Unit): HTMLElement = element("mark", setup)
inline fun HTMLElement.nav(setup: HTMLElement.()->Unit): HTMLElement = element("nav", setup)
inline fun HTMLElement.noframes(setup: HTMLElement.()->Unit): HTMLElement = element("noframes", setup)
inline fun HTMLElement.noscript(setup: HTMLElement.()->Unit): HTMLElement = element("noscript", setup)
inline fun HTMLElement.p(setup: HTMLElement.()->Unit): HTMLElement = element("p", setup)
inline fun HTMLElement.picture(setup: HTMLElement.()->Unit): HTMLElement = element("picture", setup)
inline fun HTMLElement.pre(setup: HTMLElement.()->Unit): HTMLElement = element("pre", setup)
inline fun HTMLElement.rp(setup: HTMLElement.()->Unit): HTMLElement = element("rp", setup)
inline fun HTMLElement.rt(setup: HTMLElement.()->Unit): HTMLElement = element("rt", setup)
inline fun HTMLElement.ruby(setup: HTMLElement.()->Unit): HTMLElement = element("ruby", setup)
inline fun HTMLElement.s(setup: HTMLElement.()->Unit): HTMLElement = element("s", setup)
inline fun HTMLElement.samp(setup: HTMLElement.()->Unit): HTMLElement = element("samp", setup)
inline fun HTMLElement.section(setup: HTMLElement.()->Unit): HTMLElement = element("section", setup)
inline fun HTMLElement.small(setup: HTMLElement.()->Unit): HTMLElement = element("small", setup)
inline fun HTMLElement.span(setup: HTMLElement.()->Unit): HTMLElement = element("span", setup)
inline fun HTMLElement.strike(setup: HTMLElement.()->Unit): HTMLElement = element("strike", setup)
inline fun HTMLElement.strong(setup: HTMLElement.()->Unit): HTMLElement = element("strong", setup)
inline fun HTMLElement.sub(setup: HTMLElement.()->Unit): HTMLElement = element("sub", setup)
inline fun HTMLElement.summary(setup: HTMLElement.()->Unit): HTMLElement = element("summary", setup)
inline fun HTMLElement.sup(setup: HTMLElement.()->Unit): HTMLElement = element("sup", setup)
inline fun HTMLElement.svg(setup: HTMLElement.()->Unit): HTMLElement = element("svg", setup)
inline fun HTMLElement.template(setup: HTMLElement.()->Unit): HTMLElement = element("template", setup)
inline fun HTMLElement.title(setup: HTMLElement.()->Unit): HTMLElement = element("title", setup)
inline fun HTMLElement.tt(setup: HTMLElement.()->Unit): HTMLElement = element("tt", setup)
inline fun HTMLElement.u(setup: HTMLElement.()->Unit): HTMLElement = element("u", setup)
inline fun HTMLElement.ul(setup: HTMLElement.()->Unit): HTMLElement = element("ul", setup)
inline fun HTMLElement.`var`(setup: HTMLElement.()->Unit): HTMLElement = element("var", setup)
inline fun HTMLElement.wbr(setup: HTMLElement.()->Unit): HTMLElement = element("wbr", setup)

inline fun HTMLElement.text(literal: String): Text {
    val text = Text(literal)
    appendChild(text)
    return text
}

fun sample() = html {
    div {
        p { text("Hello world!") }
    }
}