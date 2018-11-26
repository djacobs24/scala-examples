package models

/**
*   A representation of a triangle object
*/
case class Triangle (
    color: String,
    sideOne: Float,
    sideTwo: Float,
    sideThree: Float,
    isPolygon: Boolean = true
) extends Shape
