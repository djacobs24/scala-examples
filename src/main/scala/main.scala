package example_1

import models._
import calculations._

/**
*   Main is where the application will enter
*/
object Main extends App {

    val s = Square(Red, 2)
    SquareCalc(s).displayCalculations()

    val r = Rectangle(Blue, 2, 4)
    RectangleCalc(r).displayCalculations()

    val t = Triangle(Yellow, 8, 7, 3)
    TriangleCalc(t).displayCalculations()

    val c = Circle(Red, 3)
    CircleCalc(c).displayCalculations()

}
