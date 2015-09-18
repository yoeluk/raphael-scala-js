package raphaeljs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 12/05/15.
 */

@js.native
trait Transform extends js.Object {
  def dx: js.UndefOr[Double] = js.native
  def dy: js.UndefOr[Double] = js.native
  def scalax: js.UndefOr[Double] = js.native
  def scalay: js.UndefOr[Double] = js.native
  def shear: js.UndefOr[Double] = js.native
  def rotate: js.UndefOr[Double] = js.native
  def isSimple: js.UndefOr[Boolean] = js.native
}

@js.native
trait Matrix extends js.Object {
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double, matrix: Matrix): Unit = js.native
  @JSName("clone")
  def cloneMatr: Matrix = js.native
  def invert: Matrix = js.native
  def rotate(a: Double, x: Double, y: Double): Unit = js.native
  def scale(x: Double, y: Double = 0.0, cx: Double = 0.0, cy: Double = 0.0): Unit = js.native
  def split: Transform = js.native
  def toTransformString: String = js.native
  def translate(x: Double, y: Double): Unit = js.native
  def x(x: Double, y: Double): Double = js.native
  def y(x: Double, y: Double): Double = js.native
}
