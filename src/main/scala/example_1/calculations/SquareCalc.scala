package example_1.calculations

import example_1.models.Square

/**
 *  SquareCalc holds the logic for square calculations
 */
case class SquareCalc(square: Square) extends ShapeCalc {

    override def getArea: Float = {
        val side = square.side
        side * side
    }

    override def getPerimeter: Float = {
        val side = square.side
        side * 4
    }

    override def displayCalculations(): Unit = {
        val color = square.color.toString.toLowerCase
        val side = square.side
        val area = SquareCalc(square).getArea
        val perimeter = SquareCalc(square).getPerimeter
        println("The " + color + " square with sides of " + side + " has an area of " + area + " and perimeter of " + perimeter + ".")
    }

}
