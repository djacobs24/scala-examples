package example_3.s99

import example_3.data._

object P03 {

    def run(): Unit = {
        println("\n========== P03 ==========")
        P03.nthItem(0, Data.list1)
        P03.nthItem(0, Data.list2)
        P03.nthItem(1, Data.list3)        
        P03.nthItem(2, Data.list4)
        P03.nthItem(2, Data.list5)
        P03.nthItem(1, Data.list6)        
        P03.nthItem(2, Data.list7)
    }

    // nthItem finds the nth element of a list
    def nthItem[A](i: Int, l: List[A]): Unit = {
        if (i >= l.size) println("Index out of range")
        else println(l(i))
    }
    
}
