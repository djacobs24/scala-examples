package models

/**
*   A representation of a rectangle object
*/
case class Rectangle (
    val name: String,
    val length: Float,
    val width: Float 
) extends Shape
