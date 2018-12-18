package s99

import data._

object P06 {

    def run() = {
        println("\n========== P06 ==========")
        println(isPalindrome(Data.list1))
        println(isPalindrome(Data.list2))
        println(isPalindrome(Data.list3))
        println(isPalindrome(Data.list4))
        println(isPalindrome(Data.list5))
        println(isPalindrome(Data.list6))
        println(isPalindrome(Data.list7))
        println(isPalindrome(Data.list8))
        println(isPalindrome(Data.list9))
        println(isPalindrome(Data.list10))
    }

    def isPalindrome[A](list: List[A]): Boolean = list == list.reverse
    
}
