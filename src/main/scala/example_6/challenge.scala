package example_6

object Challenge {

  def run(): Unit = {
    println(stringSplosion("Code"))
    println(stringSplosion("abc"))
    println(stringSplosion("ab"))
    println(stringSplosion(""))
    println(sumNumbers(List(4,5,"g","",0)))
    canBalance(List(2,1,1,2,1))
    canBalance(List(1,1,1,2,1))
  }

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

  def sumNumbers[A](list: List[A]): Int = {
    var sum = 0
    for (x <- list) {
      if (x.getClass.getSimpleName == "Integer" ) {
        sum += x.asInstanceOf[Int]
      }
    }
    sum
  }

  def canBalance(list: List[Int]): Boolean = {
    if (list.isEmpty) false
    else {
      if (list.sum % 2 == 0 ) true
      else false
    }
  }

}
