package example_3.s99

import example_3.data._

object P05 {

    def run(): Unit = {
        println("\n========== P05 ==========")
        println(reverseList(Data.list1))
        println(reverseList(Data.list2))
        println(reverseList(Data.list3))
        println(reverseList(Data.list4))
        println(reverseList(Data.list5))
        println(reverseList(Data.list6))
        println(reverseList(Data.list7))
    }

    def reverseList[A](list: List[A]): List[A] = list.size match {
        case 0 => list
        case 1 => list
        case _ => list.foldLeft(List[A]()) { (r, h) => h :: r }
    }
    
}
