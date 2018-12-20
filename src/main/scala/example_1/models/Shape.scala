package example_1.models

/**
 *  Shape is the base of all "shapes"
 */
sealed trait Shape {
    val color: PrimeColor
    val isPolygon: Boolean
}

/**
 *  A representation of a square object
 */
case class Square (
    color: PrimeColor,
    side: Float,
    isPolygon: Boolean = true
) extends Shape

/**
 *  A representation of a rectangle object
 */
case class Rectangle (
    color: PrimeColor,
    length: Float,
    width: Float,
    isPolygon: Boolean = true
) extends Shape

/**
 *  A representation of a triangle object
 */
case class Triangle (
    color: PrimeColor,
    sideOne: Float,
    sideTwo: Float,
    sideThree: Float,
    isPolygon: Boolean = true
) extends Shape

/**
 *  A representation of a circle object
 */
case class Circle (
    color: PrimeColor,
    radius: Float,
    isPolygon: Boolean = false
) extends Shape