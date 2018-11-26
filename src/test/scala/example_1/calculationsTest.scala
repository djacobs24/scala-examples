import scala.math.BigDecimal
import org.scalatest._
import models._
import calculations._

class calculationsTest extends FlatSpec with Matchers {

    /**
    *   Defining the shapes
    */
    val s = Square("square", 2)
    val r = Rectangle("rectangle", 2, 3)
    val t = Triangle("triangle", 8, 7, 3)

    /**
    *   A square with sides of 2 should have an area of 4   
    */
    "Square area" should "equal 4" in {
        SquareCalc(s).getArea() should be (4)
    }

    /**
    *   A rectangle with sides of 2 and 3 should have an area of 6   
    */
    "Rectangle area" should "equal 6" in {
        RectangleCalc(r).getArea() should be (6)
    }

    /**
    *   A triangle with sides of 8, 7, and 3 should have an area of 8   
    */
    "Triangle area" should "equal 10.39" in {
        val triangleArea = TriangleCalc(t).getArea() 
        val roundingMode = BigDecimal.RoundingMode.HALF_UP
        BigDecimal(triangleArea).setScale(2, roundingMode).toDouble should be (10.39)
    }

    /**
    *   A square with sides of 2 should have a perimeter of 8   
    */
    "Square perimeter" should "equal 8" in {
        SquareCalc(s).getPerimeter() should be (8)
    }

    /**
    *   A rectangle with sides of 2 and 3 should have a perimeter of 10 
    */
    "Rectangle perimeter" should "equal 10" in {
        RectangleCalc(r).getPerimeter() should be (10)
    }

    /**
    *   A triangle with sides of 8, 7, and 3 should have a perimeter of 18  
    */
    "Triangle perimeter" should "equal 18" in {
        TriangleCalc(t).getPerimeter() should be (18)
    }

}
