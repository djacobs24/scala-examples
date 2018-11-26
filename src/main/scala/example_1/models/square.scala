package models

/**
*   A representation of a square object
*/
case class Square (
    color: PrimeColor,
    side: Float,
    isPolygon: Boolean = true
) extends Shape
