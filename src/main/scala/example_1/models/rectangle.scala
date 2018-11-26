package models

/**
*   A representation of a rectangle object
*/
case class Rectangle (
    color: String,
    length: Float,
    width: Float,
    isPolygon: Boolean = true
) extends Shape
