package example_2.concepts

object MapsAndFlatMaps {

    /**
      * map converts one array to another array
      */
    val intList = List(31,58,34,92,6,12)
    val intListTimesThree: List[Int] = intList.map(_ * 3) // List(93, 174, 102, 276, 18, 36)

    val stringList = List("A", "B", "C", "D")
    val stringListToLower: List[String] = stringList.map(x => x.toLowerCase)

    /**
      * flatMap is used to flatten an array of arrays into a single array
      */
    val intList2 = List(List(2,4,6),List(8),List(10,12,14,16))
    val flatIntList = intList2.flatMap(x => x) // List(2, 4, 6, 8, 10, 12, 14, 16)
    val flatIntList2 = intList2.flatten // List(2, 4, 6, 8, 10, 12, 14, 16)
    val flatIntList3 = intList2.flatten.map(_ * 3) // List(2, 4, 6, 8, 10, 12, 14, 16)

    def displayMapsData(): Unit = {
        println("intList: " + intList)
        println("intListTimesThree: " + intListTimesThree)
        println("stringList: " + stringList)
        println("stringListToLower: " + stringListToLower)
        println("flatIntList: " + flatIntList)
        println("flatIntList2: " + flatIntList2)
        println("flatIntList3: " + flatIntList3)
    }

}
