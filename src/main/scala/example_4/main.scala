package example_4

import scala.util.control.Exception

object Main {

  def main(args: Array[String]): Unit = {
    println(badDivideFunc(4,2))
    //println(badDivideFunc(4,0))
    println(goodDivideFunc(4,2))
    println(goodDivideFunc(4,0))
  }

  def badDivideFunc(x: Int, y: Int): Int = {
    if(y == 0)
      throw new Exception("cannot divide by zero")
    x / y
  }

  // Either - returns a left or right side
  def goodDivideFunc(x: Int, y: Int): Either[Exception, Int] = {
      if(y == 0) Left(new Exception("cannot divide by zero"))
      Right(x/y)
  }

  // Option - there may or may not be a return value
  def getMiddleName(name: String): Option[String] = ???

  // Future - the return value may or may not be available right now
  //def loadUser(id: String): Future[String] = ???

}
