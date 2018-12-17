package example_4

import scala.util.control.Exception

object Main {

  def main(args: Array[String]): Unit = {
    //println(badDivideFunction(4,2))
    //println(badDivideFunction(4,0))
    println(goodDivideFunction(4,2))
    println(goodDivideFunction(4,0))
    println(goodDivideFunction(5,0))
    println(goodDivideFunction(2435,345))
    println(goodDivideFunction(100,0))
  }

  // A quick look at this function tells us that it takes 
  // in two ints and returns an int.
  // This is a bad function because it actually throws an 
  // exception if we try to divide by two and may never 
  // return the int. 
  // This is a non-pure function (it has side effects).
  def badDivideFunction(x: Int, y: Int): Int = {
    if(y == 0)
      throw new Exception("cannot divide by zero")
    x / y
  }

  // A quick look at this function tells us that it takes 
  // in two ints and returns either an excpetion or an int.
  // This is a pure function.
  def goodDivideFunction(x: Int, y: Int): Either[Exception, Int] = {
      if(y == 0) Left(new Exception("cannot divide by zero"))
      else Right(x/y)
  }

}
