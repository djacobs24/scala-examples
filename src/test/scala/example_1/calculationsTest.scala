import org.scalatest._
import models._
import calculations._

class calculationsTest extends FlatSpec with Matchers {

    /**
    *   A square with sides of 2 should have an area of 4   
    */
    val s = Square("square", 2)
    "Square area (2 X 2)" should "equal 4" in {
        SquareCalc(s).getArea() should be (4)
    }

    /**
    *   A rectangle with sides of 2 and 3 should have an area of 6   
    */
    val r = Rectangle("rectangle", 2, 3)
    "Rectangle area (2 X 3)" should "equal 6" in {
        RectangleCalc(r).getArea() should be (6)
    }

    /**
    *   A triangle with a base of 4 and height of 4 should have an area of 8   
    */
    val t = Triangle("triangle", 4, 4)
    "Triangle area (4 X 4 / 2)" should "equal 8" in {
        TriangleCalc(t).getArea() should be (8)
    }

}
