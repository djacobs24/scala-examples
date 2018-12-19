package example_6

import scala.collection.mutable.ListBuffer

object The_Challenge {

  def run(): Unit = {
    println(stringSplosion("Code"))
    println(stringSplosion("abc"))
    println(stringSplosion("ab"))
    println(stringSplosion(""))
  }

  // stringSplosion
  def stringSplosion(string: String): String = {
    var index = 0
    val stringLength = string.length
    var returnString = ""
    while(index <= stringLength) {
      returnString += string.slice(0, index)
      index += 1
    }
    returnString
  }

}
