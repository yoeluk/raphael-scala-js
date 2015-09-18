package raphaeljs

import scala.scalajs.js

/**
 * Created by yoelusa on 11/05/15.
 */

@js.native
trait Paper extends js.Object {
  def add(json: js.Array[js.Dynamic]): js.Array[Element] = js.native
  def bottom: Element = js.native
  def circle(x: Double, y: Double, r: Double): Element = js.native
  def clear(): Unit = js.native
  def customAttributes: js.Dynamic = js.native
  def ellipse(x: Double, y: Double, rx: Double, ry: Double): Element = js.native
  def forEach(callback: js.Function1[Element, Unit], thisArg: js.Dynamic = js.native): Paper = js.native
  def getById(id: Int): Element = js.native
  def getElementByPoint(x: Double, y: Double): Element = js.native
  def getElementsByPoint(x: Double, y: Double): js.Array[Element] = js.native
  def getFont(family: String, weight: Int = 400, style: String = "", stretch: String = ""): js.Dynamic = js.native
  def image(src: String, x: Double, y: Double, width: Double, height: Double): Element = js.native
  def path(pathString: String = ""): Element = js.native
  def print(x: Double, y: Double, string: String, font: js.Dynamic, size: Double = 0.0,
            origin: String = "", letter_spacing: Double = 0): Element = js.native
  def raphael: Raphael = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, r: Double = 0.0): Element = js.native
  def remove(): Unit = js.native
  def renderfit(): Unit = js.native
  def safari(): Unit = js.native
  def set(): Set = js.native
  def setFinish(): Set = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setStart(): Unit = js.native
  def setViewBox(x: Double, y: Double, w: Double, h: Double, fit: Boolean = true): Unit = js.native
  def text(x: Double, y: Double, text: String): Element = js.native
  def top: Element = js.native
}
