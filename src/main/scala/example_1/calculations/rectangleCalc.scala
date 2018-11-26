package calculations

import models.Rectangle

/**
*   RectangleCalc holds the logic for rectangle calculations
*/
case class RectangleCalc(rectangle: Rectangle) extends ShapeCalc {

    override def getArea() = {
        val length = rectangle.length
        val width = rectangle.width
        length * width
    }

    override def getPerimeter() = {
        val length = rectangle.length
        val width = rectangle.width
        length * 2 + width * 2
    }

}
