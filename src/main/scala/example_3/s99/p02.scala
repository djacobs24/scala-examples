package s99

import data._

object P02 {

    def run() = {
        println("\n========== P02 ==========")
        P02.secondToLast(Data.list1)
        P02.secondToLast(Data.list2)
        P02.secondToLast(Data.list3)        
        P02.secondToLast(Data.list4)
        P02.secondToLast(Data.list5)
        P02.secondToLast(Data.list6)        
        P02.secondToLast(Data.list7)
    }

    // secondToLast finds the second to last element of a list
    def secondToLast[A](l: List[A]) = l.size match {
        case 0 => println("Empty list")
        case 1 => println("Only one element in list")
        case _ => println(l(l.size - 2))
    }
    
}
