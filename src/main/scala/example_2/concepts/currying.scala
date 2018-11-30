package concepts

object Currying {

    // finalPrice takes three parameters and performs a calculation on them
    // to get the final price of an item
    def finalPrice(vat: Double)(serviceCharge: Double)(price: Double): Double = 
        price + (price * serviceCharge / 100) + (price * vat / 100)

    // Value added tax
    val vat = 6.5
    val serviceCharge = 20   
    val microwaveCost = 200
    val refrigeratorCost = 1000
    val ovenCost = 600

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
}
