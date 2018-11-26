package calculations

import models.Triangle

case class TriangleCalc(triangle: Triangle) extends ShapeCalc {

    override def getArea() = {
        val base = triangle.base
        val height = triangle.height
        base * height / 2
    }

}
