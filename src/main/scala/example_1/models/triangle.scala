package models

/**
*   A representation of a triangle object
*/
case class Triangle (
    val color: String,
    val sideOne: Float,
    val sideTwo: Float,
    val sideThree: Float
) extends Shape
