package calculations

import models.Triangle
import scala.math.sqrt
import scala.math.abs

/**
*   TriangleCalc holds the logic for triangle calculations
*/
case class TriangleCalc(triangle: Triangle) extends ShapeCalc {

    override def getArea() = {
        val sideOne = triangle.sideOne
        val sideTwo = triangle.sideTwo
        val sideThree = triangle.sideThree
        val perimeter = getPerimeter() / 2
        val beforeSqrt = perimeter * (perimeter - sideOne) * (perimeter - sideTwo) * (perimeter - sideThree)
        sqrt(beforeSqrt).toFloat
    }

    override def getPerimeter() = {
        val sideOne = triangle.sideOne
        val sideTwo = triangle.sideTwo
        val sideThree = triangle.sideThree
        sideOne + sideTwo + sideThree
    }

}
