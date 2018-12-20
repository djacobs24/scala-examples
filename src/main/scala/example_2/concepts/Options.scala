package example_2.concepts

object Options {

    sealed trait Option[+A]
    case class Some[+A](get: A) extends Option[A]
    case object None extends Option[Nothing]

    // mean calculates the mean of a list
    def mean(xs: Seq[Double]): Option[Double] =
        if (xs.isEmpty) None
        else Some(xs.sum / xs.length)

    // displayOptionsData displays the data
    def displayOptionsData() {
        println(mean(Seq(4,6,8)))
        println(mean(Seq(2.2,6.1,4.9)))
        println(mean(Seq()))
    }

}