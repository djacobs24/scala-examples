package models

sealed trait Appliance{
    val name: String
    val price: Double
}

case class Microwave(
    val name: String = "Microwave",
    val version: Double = 1.0,
    val price: Double = 99.99
) extends Appliance

case class Refrigerator(
    val name: String = "Refrigerator",
    val version: Double = 1.0,
    val price: Double = 999.99
)

case class Oven(
    val name: String = "Oven",
    val version: Double = 1.0,
    val price: Double = 599.99
)