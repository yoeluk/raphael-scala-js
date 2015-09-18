import org.scalajs.dom.html
import scala.scalajs._,js.annotation.JSName

/**
 * Created by yoelusa on 11/05/15.
 */
package object raphaeljs {

  @js.native
  trait BezierInfo extends js.Object {
    var min: Point = js.native
    var max: Point = js.native
  }

  @js.native
  trait PointInfo extends Point {
    def m: Point = js.native
    def n: Point = js.native
    def start: Point = js.native
    def end: Point = js.native
  }

  @js.native
  trait ColorInfo extends js.Object {
    var r: js.UndefOr[Double] = js.native
    var g: js.UndefOr[Double] = js.native
    var b: js.UndefOr[Double] = js.native
    var hex: js.UndefOr[String] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var h: js.UndefOr[Double] = js.native
    var s: js.UndefOr[Double] = js.native
    var v: js.UndefOr[Double] = js.native
    var l: js.UndefOr[Double] = js.native
  }

  @js.native
  trait Raphael extends js.Object

  @js.native
  @JSName("Raphael")
  object Raphael extends js.Object {
    def apply(el: String, w: Double, h: Double, cb: => Unit): Paper = js.native
    def apply(el: html.Element, w: Double, h: Double): Paper = js.native
    def apply(x: Double, y: Double, w: Double, h: Double, cb: => Unit): Paper = js.native
    def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = js.native
    def animation(params: js.Dynamic, ms: Double, easing: String = "", callback: => Unit = ()): Animation = js.native
    def bezierBBox(p1x: Double,
                   p1y: Double,
                   c1x: Double,
                   c1y: Double,
                   c2x: Double,
                   c2y: Double,
                   p2x: Double,
                   p2y: Double): BezierInfo = js.native
    def color(clr: String): ColorInfo = js.native
    def createUUID: String = js.native
    def deg(deg: Double): Double = js.native
    def findDotsAtSegment(p1x: Double,
                          p1y: Double,
                          c1x: Double,
                          c1y: Double,
                          c2x: Double,
                          c2y: Double,
                          p2x: Double,
                          p2y: Double): PointInfo = js.native

    def registerFont(font: js.Dynamic): js.Dynamic = js.native
  }

}
