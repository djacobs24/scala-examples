package models

/**
*   A representation of a square object
*/
case class Square (
    color: String,
    side: Float,
    isPolygon: Boolean = true
) extends Shape
