package example_1

import models._
import calculations._

/**
*   Main is where the application will enter
*/
object Main extends App {

    val s = Square("square", 2)
    val sArea = SquareCalc(s).getArea()
    println(sArea)

    val r = Rectangle("rectangle", 2, 4)
    val rArea = RectangleCalc(r).getArea()
    println(rArea)

    val t = Triangle("triangle", 8, 7, 3)
    val tArea = TriangleCalc(t).getArea()
    println(tArea)
}
