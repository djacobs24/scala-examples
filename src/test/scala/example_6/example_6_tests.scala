package example_6

import org.scalatest._


class Example6Tests extends FlatSpec with Matchers {

  "StringSplosion - Code" should "equal CCoCodCode" in {
    Challenge.stringSplosion("Code") should be ("CCoCodCode")
  }

  "StringSplosion - abc" should "equal aababc" in {
    Challenge.stringSplosion("abc") should be ("aababc")
  }

  "StringSplosion - ab" should "equal aab" in {
    Challenge.stringSplosion("ab") should be ("aab")
  }

  "StringSplosion - ''" should "equal ''" in {
    Challenge.stringSplosion("") should be ("")
  }

  "Sum numbers" should "return an integer" in {
    Challenge.sumNumbers(List()).isValidInt should be (true)
  }

  "Sum numbers List(4,5,\"g\",\"\",0)" should "return 9" in {
    Challenge.sumNumbers(List(4,5,"g","",0)) should be (9)
  }

  "Empty list" should "return false" in {
    Challenge.canBalance(List()) should be (false)
  }

  "Balanced list" should "return true" in {
    Challenge.canBalance(List(1,1,1,2,1)) should be (true)
  }

  "Unbalanced list" should "return false" in {
    Challenge.canBalance(List(2,1,1,2,1)) should be (false)
  }

}
