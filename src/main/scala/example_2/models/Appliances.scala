package example_2.models

sealed trait Appliance{
    val name: String
    val price: Double
}

case class Microwave(
    name: String = "Microwave",
    version: Double = 1.0,
    price: Double = 99.99
) extends Appliance

case class Refrigerator(
    name: String = "Refrigerator",
    version: Double = 1.0,
    price: Double = 999.99
)

case class Oven(
    name: String = "Oven",
    version: Double = 1.0,
    price: Double = 599.99
)
