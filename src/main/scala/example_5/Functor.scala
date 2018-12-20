package example_5

object Functor {

  // Functors apply a wrapped function to a wrapped value
  def addThree(list: List[Int]): List[Int] = list.map(3+)

  def multiplyTwo(list: List[Int]): List[Int] = list.map(2*)

}
