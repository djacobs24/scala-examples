package example_1.calculations

import example_1.models.Rectangle

/**
 *  RectangleCalc holds the logic for rectangle calculations
 */
case class RectangleCalc(rectangle: Rectangle) extends ShapeCalc {

    override def getArea: Float = {
        val length = rectangle.length
        val width = rectangle.width
        length * width
    }

    override def getPerimeter: Float = {
        val length = rectangle.length
        val width = rectangle.width
        length * 2 + width * 2
    }

    override def displayCalculations(): Unit = {
        val color = rectangle.color.toString.toLowerCase
        val length = rectangle.length
        val width = rectangle.width
        val area = RectangleCalc(rectangle).getArea
        val perimeter = RectangleCalc(rectangle).getPerimeter
        println("The " + color + " rectangle with a length of " + length + " and a height of " + width + " has an area of " + area + " and perimeter of " + perimeter + ".")
    }

}
