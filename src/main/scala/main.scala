package example_1

import models._
import calculations._

/**
*   Main is where the application will enter
*/
object Main extends App {

    val s = Square("Orange", 2)
    SquareCalc(s).displayCalculations()

    val r = Rectangle("Green", 2, 4)
    RectangleCalc(r).displayCalculations()

    val t = Triangle("Red", 8, 7, 3)
    TriangleCalc(t).displayCalculations()

}
