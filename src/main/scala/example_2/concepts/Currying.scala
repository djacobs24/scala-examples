package example_2.concepts

import example_2.models

object Currying {

    // Create the appliances
    val microwave = models.Microwave(version = 1.1, price = 129.99)
    val refrigerator = models.Refrigerator(version = 4.6, price = 2199.99)
    val oven = models.Oven()

    // Get the appliance prices
    val microwaveCost: Double = microwave.price
    val refrigeratorCost: Double = refrigerator.price
    val ovenCost: Double = oven.price

    // Get the appliance names
    val microwaveName: String = microwave.name
    val refrigeratorName: String = refrigerator.name
    val ovenName: String = oven.name

    // Get the appliance versions
    val microwaveVersion: Double = microwave.version
    val refrigeratorVersion: Double = refrigerator.version
    val ovenVersion: Double = oven.version

    // Value added tax and service charge
    val vat = 6.5
    val serviceCharge = 20  

    // finalPrice takes three parameters and performs a calculation on them
    // to get the final price of an item
    def finalPrice(vat: Double)(serviceCharge: Double)(price: Double): Double = 
        price + (price * serviceCharge / 100) + (price * vat / 100) 
    
    // If we have all the parameters at once we can pass them like so
    val totalMicrowaveCost1: Double = finalPrice(vat)(serviceCharge)(microwaveCost)
    val totalRefrigeratorCost1: Double = finalPrice(vat)(serviceCharge)(refrigeratorCost)
    val totalOvenCost1: Double = finalPrice(vat)(serviceCharge)(ovenCost)

    // Since vat and service charge are unlikely to change depending on 
    // the product we can calculate the total cost like so
    val vatApplied = finalPrice(vat) _
    val vatAndServiceChargeApplied = vatApplied(serviceCharge)
    val totalMicrowaveCost2 = vatAndServiceChargeApplied(microwaveCost)
    val totalRefrigeratorCost2 = vatAndServiceChargeApplied(refrigeratorCost)
    val totalOvenCost2 = vatAndServiceChargeApplied(ovenCost)

    // printMicrowaveCost prints the cost of the microwave
    def printMicrowaveCost() {
        println(s"$microwaveName, v$microwaveVersion: $totalMicrowaveCost2")
    }

    // printRefrigeratorCost prints the cost of the refrigerator
    def printRefrigeratorCost() {
        println(s"$refrigeratorName, v$refrigeratorVersion: $totalRefrigeratorCost2")
    }

    // printOvenCost prints the cost of the oven
    def printOvenCost() {
        println(s"$ovenName, v$ovenVersion: $totalOvenCost2")
    }

    // displayCurryingData displays the data
    def displayCurryingData() {
        printMicrowaveCost()
        printRefrigeratorCost()
        printOvenCost()
    }
    
}
