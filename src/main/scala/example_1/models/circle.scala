package models

/**
 *  A representation of a circle object
 */
case class Circle (
    color: PrimeColor,
    radius: Float,
    isPolygon: Boolean = false
) extends Shape
