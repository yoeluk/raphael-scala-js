package raphaeljs

import org.scalajs.dom

import scala.scalajs._
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 11/05/15.
 */

 trait Attrs extends js.Object {
  @JSName("arrow-end")
  var arrow_end: js.UndefOr[String] = js.native
  @JSName("clip-rect")
  var clip_rect: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
  var fill: js.UndefOr[String] = js.native
  @JSName("fill-opacity")
  var fill_opacity: js.UndefOr[Double] = js.native
  var font: js.UndefOr[String] = js.native
  @JSName("font-family")
  var font_family: js.UndefOr[String] = js.native
  @JSName("font-size")
  var font_size: js.UndefOr[Double] = js.native
  @JSName("font-weight")
  var font_weight: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var r: js.UndefOr[Double] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
  var src: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  @JSName("stroke-dasharray")
  var stroke_dasharray: js.UndefOr[String] = js.native
  @JSName("stroke-linecap")
  var stroke_linecap: js.UndefOr[String] = js.native
  @JSName("stroke-linejoin")
  var stroke_linejoin: js.UndefOr[String] = js.native
  @JSName("stroke-miterlimit")
  var stroke_miterlimit: js.UndefOr[Double] = js.native
  @JSName("stroke-opacity")
  var stroke_opacity: js.UndefOr[Double] = js.native
  @JSName("stroke-width")
  var stroke_width: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  @JSName("text-anchor")
  var text_anchor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] =js.native
  var transform: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

trait BBox extends js.Object {
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var x2: js.UndefOr[Double] = js.native
  var y2: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
}

trait Point extends js.Object {
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var alpha: js.UndefOr[Double] = js.native
}

trait Glow extends js.Object {
  var width: js.UndefOr[Double] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var offsetx: js.UndefOr[Double] = js.native
  var offsety: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
}

trait Status extends js.Object {
  def anim: Animation = js.native
  var status: Double = js.native
}

trait Element extends js.Object {
  @JSName("type")
  def kind: String = js.native
  def realPath: String = js.native
  var attrs: Attrs = js.native
  def animate(a: Animation): Element = js.native
  def animate(params: js.Dynamic, ms: Double, easing: String, cb: => Unit): Element = js.native
  def animateWith(el: Element, anim: Animation, params: js.Dynamic, ms: Double, easing: String, cb: => Unit): Element = js.native
  def animateWith(el: Element, anim: Animation, animation: Animation): Element = js.native
  def attr(a: js.Dynamic): Element = js.native
  def attr(attrName: String, value: js.Any): Element = js.native
  def attr(attrName: String): js.Any = js.native
  def attr(): Attrs = js.native
  def click(handler: js.Function1[Element, Unit]): js.Dynamic = js.native
  @JSName("clone")
  def cloneElm: Element = js.native
  def data(key: String, value: js.Any): Element = js.native
  def data(key: String): js.Any = js.native
  def dblclick(handler: js.Function1[Element, Unit]): Element = js.native
  def drag(onmove: js.ThisFunction2[Element, Double, Double, Unit],
           onstart: js.ThisFunction0[Element, Unit],
           onend: js.ThisFunction0[Element, Unit],
           mcontext: js.Dynamic = js.Dynamic.literal(),
           scontext: js.Dynamic = js.Dynamic.literal(),
           econtext: js.Dynamic = js.Dynamic.literal()
          ): Element = js.native
  def getBBox(isWithoutTransform: Boolean): BBox = js.native
  def getPointAtLength(length: Double): Point = js.native
  def getSubpath(from: Double, to: Double): String = js.native
  def getTotalLength: Double = js.native
  def glow(glow: js.Dynamic = js.Dynamic.literal()): Set = js.native
  def hide(): Unit = js.native
  def hover(f_in: js.Function1[Element, Unit],
            f_out: js.Function1[Element, Unit],
            icontext: js.Dynamic = js.Dynamic.literal(),
            ocontext: js.Dynamic = js.Dynamic.literal()
           ): Element = js.native
  def id: Int = js.native
  def insertAfter(): Element = js.native
  def insertBefore(): Element = js.native
  def isPointInside(x: Double, y: Double): Boolean = js.native
  var matrix: Matrix = js.native
  def mousedown(handler: js.Function1[Element, Unit]): Element = js.native
  def mousemove(handler: js.Function1[Element, Unit]): Element = js.native
  def mouseout(handler: js.Function1[Element, Unit]): Element = js.native
  def mouseover(handler: js.Function1[Element, Unit]): Element = js.native
  def mouseup(handler: js.Function1[Element, Unit]): Element = js.native
  def next: Element = js.native
  def node: dom.Element = js.native
  def onDragOver(handler: js.Function1[Element, Unit]): Unit = js.native
  var ox: Double = js.native
  var oy: Double = js.native
  def paper: Paper = js.native
  def pause: Element = js.native
  def pause(anim: Animation): Element = js.native
  def prev: Element = js.native
  def raphael: Raphael = js.native
  def remove(): Unit = js.native
  def removedata(key: String = ""): Element = js.native
  def resume: Element = js.native
  def resume(anim: Animation): Element = js.native
  def rotate(deg: Double, cx: Double = 0.0, cy: Double = 0.0): Element = js.native
  def scale(sx: Double, sy: Double, cx: Double = 0.0, cy: Double = 0.0): Element = js.native
  def setTime(anim: Animation, value: Double = 0.0): js.UndefOr[Element] = js.native
  def show(): Unit = js.native
  def status(): js.Array[Status] = js.native
  def status(anim: Animation): Double = js.native
  def status(anim: Animation, value: Double): Element = js.native
  def stop: Element = js.native
  def stop(anim: Animation): Element = js.native
  def toBack: Element = js.native
  def toFront: Element = js.native
  def touchcancel(handler: js.Function1[Element, Unit]): Element = js.native
  def touchend(handler: js.Function1[Element, Unit]): Element = js.native
  def touchmove(handler: js.Function1[Element, Unit]): Element = js.native
  def touchstart(handler: js.Function1[Element, Unit]): Element = js.native
  def transform: String = js.native
  def transform(tstr: String): Element = js.native
  def translate(dx: Double, dy: Double): Element = js.native
  def undbclick(handler: js.Function1[Element, Unit]): Element = js.native
  def undrag(): Unit = js.native
  def unhover(f_in: js.Function1[Element, Unit], f_out: js.Function1[Element, Unit]): Element = js.native
  def unmousedown(handler: js.Function1[Element, Unit]): Element = js.native
  def unmousemove(handler: js.Function1[Element, Unit]): Element = js.native
  def unmouseout(handler: js.Function1[Element, Unit]): Element = js.native
  def unmouseover(handler: js.Function1[Element, Unit]): Element = js.native
  def unmouseup(handler: js.Function1[Element, Unit]): Element = js.native
  def untouchcancel(handler: js.Function1[Element, Unit]): Element = js.native
  def untouchend(handler: js.Function1[Element, Unit]): Element = js.native
  def untouchmove(handler: js.Function1[Element, Unit]): Element = js.native
  def untouchstart(handler: js.Function1[Element, Unit]): Element = js.native
}
