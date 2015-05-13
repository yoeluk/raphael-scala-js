package sketcher

import org.scalajs.dom
import org.scalajs.dom.html
import scala.scalajs._,js.annotation.JSExport

import raphaeljs._

/**
 * Created by yoelusa on 11/05/15.
 */

@JSExport
object Sketcher {
  @JSExport
  def main(scene: html.Element): Unit = {
    val paper = Raphael(scene, 500, 500)
    val elems = paper.add(js.Array(
      js.Dynamic.literal(
        `type` = "circle",
        cx = 10,
        cy = 10,
        r = 5
      ),
      js.Dynamic.literal(
        `type` = "rect",
        x = 10,
        y = 10,
        width = 10,
        height = 10,
        fill = "#fc0"
      )
    ))
    paper.forEach( (el: Element) => {
      el.attr(js.Dynamic.literal(stroke = "blue"))
      ()
    })
    val rect = elems(1)
    rect.drag(
      onmove = { (el: Element, dx: Double, dy: Double) =>
        el.transform(s"...t$dx $dy")
        ()
      },
      onstart = { (el: Element) =>
        el.transform("...s2 2")
        el.ox = el.attr("x").asInstanceOf[Double]
        el.oy = el.attr("x").asInstanceOf[Double]
        ()
      },
      onend = { (el: Element) =>
        el.transform("...s1 1");()
      }
    )
  }
}