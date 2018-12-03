package concepts

object Lists {

    // A sample list to play with
    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    // Returns a list of the first 3 elements
    val firstThreeDays = days.take(3)

    // Returns a list of all elements while they are less than 9 in length
    val whileDaysLessThan9Length = days.takeWhile(_.length() < 9)

    // True if all elements of the list end in "y"
    val allDaysEndInY = days.forall(_.takeRight(1) == "y")

    // True if any elements of the list start with "W"
    val oneDayStartsWithW = days.exists(_.startsWith("W"))

    def displayListData() {
        println("All days: " + days)
        println("First 3 days: " + firstThreeDays)
        println("While days less than 9 length: " + whileDaysLessThan9Length)
        println("All days end in 'y': " + allDaysEndInY)
        println("One day starts with 'W': " + oneDayStartsWithW)  
    }

}
