package raphaeljs

import scala.scalajs.js

/**
 * Created by yoelusa on 12/05/15.
 */

@js.native
trait Animation extends js.Object {
  def delay(delay: Double): Animation = js.native
  def repeat(repeat: Double): Animation = js.native
}