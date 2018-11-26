package models

/**
*   A representation of a rectangle object
*/
case class Rectangle (
    color: PrimeColor,
    length: Float,
    width: Float,
    isPolygon: Boolean = true
) extends Shape
