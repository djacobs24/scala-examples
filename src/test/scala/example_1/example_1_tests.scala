import scala.math.BigDecimal
import org.scalatest._
import models._
import calculations._

class Example1Tests extends FlatSpec with Matchers {

    /**
     *  Defining the shapes
     */
    val s = Square(Red, 2)
    val r = Rectangle(Blue, 2, 3)
    val t = Triangle(Yellow, 8, 7, 3)
    val c = Circle(Red, 3)

    /**
     *  Making the calculations
     */
    val squareArea = SquareCalc(s).getArea
    val squarePerimeter = SquareCalc(s).getPerimeter
    val rectangleArea = RectangleCalc(r).getArea
    val rectanglePerimeter = RectangleCalc(r).getPerimeter
    val triangleArea = TriangleCalc(t).getArea
    val trianglePerimeter = TriangleCalc(t).getPerimeter
    val circleArea = CircleCalc(c).getArea
    val circlePerimeter = CircleCalc(c).getPerimeter

    val roundingMode = BigDecimal.RoundingMode.HALF_UP

    /**
     *  A square with sides of 2 should have an area of 4   
     */
    "Square area with sides of 2" should "equal 4" in {
        squareArea should be (4)
    }

    /**
     *  A rectangle with sides of 2 and 3 should have an area of 6   
     */
    "Rectangle area with sides of 2 and 3" should "equal 6" in {
        rectangleArea should be (6)
    }

    /**
     *  A triangle with sides of 8, 7, and 3 should have an area of 8   
     */
    "Triangle area with sides of 8, 7, and 3" should "equal 10.39" in {
        BigDecimal(triangleArea).setScale(2, roundingMode).toDouble should be (10.39)
    }

    /**
     *  A circle with a radius of 4 should have an area of 28.27
     */
    "Circle area with a radius of 4" should "equal 28.27" in {
        BigDecimal(circleArea).setScale(2, roundingMode).toDouble should be (28.27)
    }

    /**
     *  A square with sides of 2 should have a perimeter of 8   
     */
    "Square perimeter with sides of 2" should "equal 8" in {
        squarePerimeter should be (8)
    }

    /**
     *  A rectangle with sides of 2 and 3 should have a perimeter of 10 
     */
    "Rectangle perimeter with sides of 2 and 3" should "equal 10" in {
        rectanglePerimeter should be (10)
    }

    /**
     *  A triangle with sides of 8, 7, and 3 should have a perimeter of 18  
     */
    "Triangle perimeter with sides of 8, 7, and 3" should "equal 18" in {
        trianglePerimeter should be (18)
    }

    /**
     *  A circle with a radius of 4 should have a perimeter of 18.85
     */
    "Circle perimeter with a radius of 4" should "equal 18.85" in {
        BigDecimal(circlePerimeter).setScale(2, roundingMode).toDouble should be (18.85)
    }

}
