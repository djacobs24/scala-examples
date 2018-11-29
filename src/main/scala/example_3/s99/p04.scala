package s99

import data._

object P04 {

    def run() = {
        println("\n========== P04 ==========")
        println(P04.length(Data.list1))
        println(P04.length(Data.list2))
        println(P04.length(Data.list3))     
        println(P04.length(Data.list4))
        println(P04.length(Data.list5))
        println(P04.length(Data.list6))       
        println(P04.length(Data.list7))
    }

    // length finds the length of a list
    def length[A](l: List[A]): Int = {
        @annotation.tailrec
        def loop(i: Int, ls: List[A]): Int = ls match {
            case Nil => i
            case _ :: tail => loop((i + 1), tail)
        }  
        loop(0, l)
    }
    
}
