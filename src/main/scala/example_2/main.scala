package example_2

import concepts._
import models._

/**
 *  Main is where the application will enter
 */
object Main {

    def main(args: Array[String]): Unit = {
        /**
         *  Polymorphic Methods
         */
         // Display the index
        println(PolymorphicMethod.findFirst(Array(0, 1, 2, 3), (x: Int) => x == 2))

        /**
         *  Pattern Matching
         */
         // Create the notifications
        val email = Email("Susan", "Meeting on Tuesday", "Are we still meeting?")
        val sms = SMS("419-262-4600", "Are you there?")
        val voiceRecording = VoiceRecording("Tom", "voicerecording.org/id/12345")
        // Display the notifications
        println(PatternMatching.showNotification(email))
        println(PatternMatching.showNotification(sms))
        println(PatternMatching.showNotification(voiceRecording))

    }
    
}
