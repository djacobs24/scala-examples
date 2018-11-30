package concepts

import models._

object Currying {

    // Create the appliances
    val microwave = models.Microwave(name = "Microwave 1.1", price = 129.99)
    val refrigerator = models.Refrigerator(name = "Refrigerator 4.6", price = 2199.99)
    val oven = models.Oven()

    // Get the appliance prices
    val microwaveCost = microwave.price
    val refrigeratorCost = refrigerator.price
    val ovenCost = oven.price

    // Get the appliance names
    val microwaveName = microwave.name
    val refrigeratorName = refrigerator.name
    val ovenName = oven.name

    // Value added tax and service charge
    val vat = 6.5
    val serviceCharge = 20  

    // finalPrice takes three parameters and performs a calculation on them
    // to get the final price of an item
    def finalPrice(vat: Double)(serviceCharge: Double)(price: Double): Double = 
        price + (price * serviceCharge / 100) + (price * vat / 100) 
    
    // If we have all the parameters at once we can pass them like so
    val totalMicrowaveCost1 = finalPrice(vat)(serviceCharge)(microwaveCost)
    val totalRefrigeratorCost1 = finalPrice(vat)(serviceCharge)(refrigeratorCost)
    val totalOvenCost1 = finalPrice(vat)(serviceCharge)(ovenCost)

    // Since vat and service charge are unlikely to change depending on 
    // the product we can calculate the total cost like so
    val vatApplied = finalPrice(vat) _
    val vatAndServiceChargeApplied = vatApplied(serviceCharge)
    val totalMicrowaveCost2 = vatAndServiceChargeApplied(microwaveCost)
    val totalRefrigeratorCost2 = vatAndServiceChargeApplied(refrigeratorCost)
    val totalOvenCost2 = vatAndServiceChargeApplied(ovenCost)

    def printMicrowaveCost() {
        println(s"$microwaveName: $totalMicrowaveCost2")
    }

    def printRefrigeratorCost() {
        println(s"$refrigeratorName: $totalRefrigeratorCost2")
    }

    def printOvenCost() {
        println(s"$ovenName: $totalOvenCost2")
    }
}
