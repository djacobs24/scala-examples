package example_1

import models._
import calculations._
import scala.math.Pi

object Main {

    def main(args: Array[String]): Unit = {
        // Create the shapes
        val s = Square(Red, 2)
        val r = Rectangle(Blue, 2, 3)
        val t = Triangle(Yellow, 8, 7, 3)
        val c = Circle(Red, 3)

        // Display the calculations
        SquareCalc(s).displayCalculations()
        RectangleCalc(r).displayCalculations()
        TriangleCalc(t).displayCalculations()
        CircleCalc(c).displayCalculations()
    }

}
