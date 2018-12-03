package concepts

object Mixin {

    abstract class Message {
        val message: String
    }

    class Email extends Message {
        val message = "I'm an email"
    }

    class SMS extends Message {
        val message = "I'm an sms"
    }

    // This is the mixin
    trait LoudMessage extends Message {
        def loudMessage = message.toUpperCase()
    }

    class LoudEmail extends Email with LoudMessage

    class LoudSMS extends SMS with LoudMessage

    // displayMixinData displays the data
    def displayMixinData() {
        val loudEmail = new LoudEmail
        val loudSMS = new LoudSMS
        println(loudEmail.message)
        println(loudEmail.loudMessage)
        println(loudSMS.message)
        println(loudSMS.loudMessage)
    }

}
