package s99

import data._

object P03 {

    def run() = {
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
    def nthItem[A](i: Int, l: List[A]) = {
        if (i >= l.size) println("Index out of range")
        else println(l(i))
    }
    
}
