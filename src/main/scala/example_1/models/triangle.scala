package models

/**
*   A representation of a triangle object
*/
case class Triangle (
    val name: String,
    val base: Float,
    val height: Float
) extends Shape
