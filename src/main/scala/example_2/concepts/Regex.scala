package example_2.concepts

object Regex {

    import scala.util.matching.Regex

    // validPassword check if the string that was passed in contains a number
    def validPassword(password: String): Boolean = {
        val requirement: Regex = "[0-9]".r
        requirement.findFirstMatchIn(password) match {
        case Some(_) => true
        case None => false
        }
    }

    // displayRegexData displays the data
    def displayRegexData() {
        println(validPassword("david"))
        println(validPassword("d4v1d"))
    }

}
