package concepts

import models._

object PatternMatching {

    /**
     *  showNotification returns a string depending on which type of notification we are dealing with
     */
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

}
