package models

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
