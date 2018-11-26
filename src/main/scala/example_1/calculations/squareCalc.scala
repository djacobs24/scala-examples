package calculations

import models.Square

/**
*   SquareCalc holds the logic for square calculations
*/
case class SquareCalc(square: Square) extends ShapeCalc {

    override def getArea() = {
        val side = square.side
        side * side
    }

    override def getPerimeter() = {
        val side = square.side
        side * 4
    }

    override def displayCalculations() = {
        val color = square.color.toLowerCase
        val side = square.side
        val area = SquareCalc(square).getArea()
        val perimeter = SquareCalc(square).getPerimeter()
        println("The " + color + " triangle with sides of " + side + " has an area of " + area + " and perimeter of " + perimeter + ".")
    }

}
