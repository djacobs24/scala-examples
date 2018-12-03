package concepts

object ForComprehensions {

    case class User(name: String, age: Int)

    // List of users
    val userBase = List(
        User("Travis", 28),
        User("Kelly", 33),
        User("Jennifer", 44),
        User("Dennis", 23)
    )

    // Add all the users in their 20's to the list
    val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
        yield user.name

    // displayForComprehensionData displays the data
    def displayForComprehensionData() {
        twentySomethings.foreach(name => println(name))
    }

}