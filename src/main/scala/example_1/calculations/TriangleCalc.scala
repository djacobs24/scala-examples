package example_1.calculations

import example_1.models.Triangle
import scala.math.sqrt

/**
 *  TriangleCalc holds the logic for triangle calculations
 */
case class TriangleCalc(triangle: Triangle) extends ShapeCalc {

    override def getArea: Float = {
        val sideOne = triangle.sideOne
        val sideTwo = triangle.sideTwo
        val sideThree = triangle.sideThree
        val halfPerimeter = getPerimeter / 2
        val beforeSqrt = halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree)
        sqrt(beforeSqrt).toFloat
    }

    override def getPerimeter: Float = {
        val sideOne = triangle.sideOne
        val sideTwo = triangle.sideTwo
        val sideThree = triangle.sideThree
        sideOne + sideTwo + sideThree
    }

    override def displayCalculations(): Unit = {
        val color = triangle.color.toString.toLowerCase
        val sideOne = triangle.sideOne
        val sideTwo = triangle.sideTwo
        val sideThree = triangle.sideThree
        val area = TriangleCalc(triangle).getArea
        val perimeter = TriangleCalc(triangle).getPerimeter
        println("The " + color + " triangle with sides of " + sideOne + ", " + sideTwo + ", and " + sideThree + " has an area of " + area + " and perimeter of " + perimeter + ".")
    }

}
