import org.scalatest._

class Example2Tests extends FlatSpec with Matchers {

    /**
     *  The find first method should return 2 since the index is at the 3rd position  
     */
    "Find first int with int in 3rd position" should "equal 2" in {
        PolymorphicMethod.findFirst(Array(0, 1, 2, 3), (x: Int) => x == 2) should be (2)
    }

    /**
     *  The find first method should return -1 since the index does not exist 
     */
    "Find first string with non-existent string" should "equal -1" in {
        PolymorphicMethod.findFirst(Array("bob", "tom", "sam", "liz"), (x: String) => x == "bill") should be (-1)
    }

}
