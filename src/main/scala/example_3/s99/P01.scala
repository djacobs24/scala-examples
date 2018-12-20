package example_3.s99

import example_3.data._

object P01 {

    def run(): Unit = {
        println("\n========== P01 ==========")
        P01.last(Data.list1)
        P01.last(Data.list2)
        P01.last(Data.list3)
        P01.last(Data.list4)
        P01.last(Data.list5)
        P01.last(Data.list6)
        P01.last(Data.list7)
    }

    // last finds the last element of a list
    def last[A](l: List[A]): Unit = l.size match {
        case 0 => println("Empty list")
        case _ => println(l.last)
    }
    
}
