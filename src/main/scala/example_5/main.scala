package example_5

object Main {

  def main(args: Array[String]): Unit = {

    // Example list of integers
    val intList = List(14, 2, 3)

    // Getting the sum and product of the ints in the list
    val sum = sumInts(intList).toString
    val product = productInts(intList).toString

    // Turning the int list into a string list
    val strList = for (i <- intList) yield i.toString

    // Making a string representation of the mathematical equation
    val strSumRep = concatEquation(strList, "+", sum)
    val strProductRep = concatEquation(strList, "*", product)

    // Print the answers
    println(strSumRep)
    println(strProductRep)
  }

  // Also can be done with sum
  def sumInts(list: List[Int]): Int = list.foldRight(0)(_ + _)

  // Also can be done with product
  def productInts(list: List[Int]): Int = list.foldRight(1)(_ * _)

  // Takes a list of strings and concatenates them with their operator, equal symbol, and answer
  def concatEquation(list: List[String], operator: String, answer: String): String = {
    list.foldRight("")(_ + " " + operator + " " + _).dropRight(2).concat("= " + answer)
  }

}
