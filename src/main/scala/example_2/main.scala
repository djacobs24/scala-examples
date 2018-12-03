package example_2

import concepts._
import models._

object Main {

    def main(args: Array[String]): Unit = {
        /**
         *  Currying
         */
        println("\n=====Currying=====") 
        Currying.displayCurryingData

        /**
         *  Higher Order Function
         */
        println("\n=====Higher Order Function=====") 
        HigherOrderFunction.displayHigherOrderFunctionData

        /**
         *  Lists
         */
        println("\n=====Lists=====") 
        Lists.displayListData

        /**
         *  Mixin
         */
        println("\n=====Mixin=====") 
        Mixin.displayMixinData

        /**
         *  Pattern Matching
         */
        println("\n=====Pattern Matching=====") 
        PatternMatching.displayPatternMatchingData

        /**         
         *  Polymorphic Methods
         */
        println("\n=====Polymorphic Methods=====") 
        PolymorphicMethod.displayPolymorphicMethodData

        /**
         *  Regex
         */
        println("\n=====Regex=====") 
        Regex.displayRegexData

        /**
         *  Tuples
         */
        println("\n=====Tuples=====") 
        Tuple.displayTupleData
    }
    
}
