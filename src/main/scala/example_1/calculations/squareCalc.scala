package calculations

import models.Square

case class SquareCalc(square: Square) extends ShapeCalc {

    override def getArea() = {
        val side = square.side
        side * side
    }

}
