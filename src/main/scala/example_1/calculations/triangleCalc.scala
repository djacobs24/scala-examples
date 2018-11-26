package calculations

import models.Triangle

/**
*   TriangleCalc holds the logic for triangle calculations
*/
case class TriangleCalc(triangle: Triangle) extends ShapeCalc {

    override def getArea() = {
        val base = triangle.base
        val height = triangle.height
        base * height / 2
    }

}
