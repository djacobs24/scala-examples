import org.scalatest._
import concepts._
import models._

class Example2Tests extends FlatSpec with Matchers {

    /**
     *  The find first method should return 2 since the index is at the 3rd position  
     */
    "Find first int with int in 3rd position" should "equal 2" in {
        PolymorphicMethod.findFirst(Array(0, 1, 2, 3), (x: Int) => x == 2) should be (2)
    }

    /**
     *  The find first method should return -1 since the index does not exist 
     */
    "Find first string with non-existent string" should "equal -1" in {
        PolymorphicMethod.findFirst(Array("bob", "tom", "sam", "liz"), (x: String) => x == "bill") should be (-1)
    }

    /**
     *  The show notification method should return the email message
     */
     "Show email notification" should "equal 'You got an email from Susan! Title: Meeting on Tuesday'" in {
        val email = Email("Susan", "Meeting on Tuesday", "Are we still meeting?")
        PatternMatching.showNotification(email) should be ("You got an email from Susan! Title: Meeting on Tuesday")
    }

    /**
     *  The show notification method should return the sms message
     */
     "Show sms notification" should "equal 'You got an SMS from 419-262-4600! Message: Are you there?'" in {
        val sms = SMS("419-262-4600", "Are you there?")
        PatternMatching.showNotification(sms) should be ("You got an SMS from 419-262-4600! Message: Are you there?")
    }

    /**
     *  The show notification method should return the voice recording message
     */
     "Show voice recording notification" should "equal 'You received a voice recording from Tom! Link: voicerecording.org/id/12345'" in {
        val voiceRecording = VoiceRecording("Tom", "voicerecording.org/id/12345")
        PatternMatching.showNotification(voiceRecording) should be ("You received a voice recording from Tom! Link: voicerecording.org/id/12345")
    }

}
