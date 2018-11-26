package calculations

import models.Circle
import scala.math.Pi

/**
*   CircleCalc holds the logic for circle calculations
*/
case class CircleCalc(circle: Circle) extends ShapeCalc {

    override def getArea() = {
        val radius = circle.radius
        (Pi * (radius * radius)).toFloat
    }

    override def getPerimeter() = {
        val radius = circle.radius
        (2 * Pi * radius).toFloat
    }

    override def displayCalculations() = {
        val color = circle.color.toString.toLowerCase
        val radius = circle.radius
        val area = CircleCalc(circle).getArea()
        val perimeter = CircleCalc(circle).getPerimeter()
        println("The " + color + " circle with a radius of " + radius + " has an area of " + area + " and perimeter of " + perimeter + ".")
    }

}
