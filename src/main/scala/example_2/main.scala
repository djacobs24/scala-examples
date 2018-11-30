package example_2

import concepts._
import models._

object Main {

    def main(args: Array[String]): Unit = {
        /**
         *  Tuple
         */
        println("\n=====Tuple=====") 
        Tuple.printAllPlanetsAndDistancesFromSun()
        Tuple.printAllPlanets()
        Tuple.printAllDistances()
        Tuple.printAllDistancesGreaterThan(110)

        /**
         *  Polymorphic Methods
         */
        println("\n=====Polymorphic Methods=====") 
        println(PolymorphicMethod.findFirst(Array(0, 1, 2, 3), (x: Int) => x == 2))

        /**
         *  Pattern Matching
         */
        println("\n=====Pattern Matching=====") 
        val email = Email("Susan", "Meeting on Tuesday", "Are we still meeting?")
        val sms = SMS("419-262-4600", "Are you there?")
        val voiceRecording = VoiceRecording("Tom", "voicerecording.org/id/12345")
        println(PatternMatching.showNotification(email))
        println(PatternMatching.showNotification(sms))
        println(PatternMatching.showNotification(voiceRecording))

        /**
         *  Mixin
         */
        println("\n=====Mixin=====") 
        val loudEmail = new Mixin.LoudEmail
        val loudSMS = new Mixin.LoudSMS
        println(loudEmail.message)
        println(loudEmail.loudMessage)
        println(loudSMS.message)
        println(loudSMS.loudMessage)

        /**
         *  Higher Order Function
         */
        println("\n=====Higher Order Function=====") 
        HigherOrderFunction.printURL()
        HigherOrderFunction.printMath()

        /**
         *  Currying
         */
        println("\n=====Currying=====") 
        Currying.printMicrowaveCost()
        Currying.printRefrigeratorCost()
        Currying.printOvenCost()

        /**
         *  Regex
         */
        println("\n=====Regex=====") 
        println(Regex.validPassword("david"))
        println(Regex.validPassword("d4v1d"))
    }
    
}
