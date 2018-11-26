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

}
