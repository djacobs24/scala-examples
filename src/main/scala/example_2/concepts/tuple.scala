package concepts

object Tuple {

    val planetsDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))

    /**
     *  printAllPlanetsAndDistancesFromSun will print the entire tuple
     */
    def printAllPlanetsAndDistancesFromSun() = {
        for (planetDistanceFromSun <- planetsDistanceFromSun) println(planetDistanceFromSun)
    }

    /**
     *  printAllPlanets will print the tuples planet names
     */
    def printAllPlanets() = {
        for (planetDistanceFromSun <- planetsDistanceFromSun) println(planetDistanceFromSun._1)
    }

    /**
     *  printAllDistances will print the tuples distances
     */
    def printAllDistances() = {
        for (planetDistanceFromSun <- planetsDistanceFromSun) println(planetDistanceFromSun._2)
    }

    /**
     *  printAllDistancesGreaterThan will print the tuples distances if greater than the parameter
     */
    def printAllDistancesGreaterThan(i: Int) = {
        for (planetDistanceFromSun <- planetsDistanceFromSun) if (planetDistanceFromSun._2 > i) println(planetDistanceFromSun._2)
    }

}
