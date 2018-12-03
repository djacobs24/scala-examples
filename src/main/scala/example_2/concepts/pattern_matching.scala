package concepts

import models._

object PatternMatching {

    // showNotification returns a string depending on which type of notification we are dealing with
    def showNotification(notification: Notification): String = {
        notification match {
            case Email(sender, title, _) =>
                s"You got an email from $sender! Title: $title"
            case SMS(number, message) =>
                s"You got an SMS from $number! Message: $message"
            case VoiceRecording(name, link) =>
                s"You received a voice recording from $name! Link: $link"
        }
    }

    val x = List(1,2,3,4,5) match {
        case Nil => 42
        case _ => 101
    }

    val y = List(1,2,3,4,5) match {
        case Nil => "empty"
        case 1 :: 2 :: 3 :: 4 :: 5 :: Nil => "equal"
    }

    // displayPatternMatchingData displays the data
    def displayPatternMatchingData() {
        val email = Email("Susan", "Meeting on Tuesday", "Are we still meeting?")
        val sms = SMS("419-262-4600", "Are you there?")
        val voiceRecording = VoiceRecording("Tom", "voicerecording.org/id/12345")
        println(PatternMatching.showNotification(email))
        println(PatternMatching.showNotification(sms))
        println(PatternMatching.showNotification(voiceRecording))
        println(PatternMatching.x)
        println(PatternMatching.y)
    }

}
