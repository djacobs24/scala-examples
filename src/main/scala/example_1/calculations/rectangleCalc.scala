package calculations

import models.Rectangle

case class RectangleCalc(rectangle: Rectangle) extends ShapeCalc {

    override def getArea() = {
        val length = rectangle.length
        val width = rectangle.width
        length * width
    }

}
