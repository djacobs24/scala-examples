package concepts

object HigherOrderFunction {

    def printURL() {
        val domainName = "www.example.com"
        def getURL = urlBuilder(ssl=false, domainName)
        val endpoint = "users"
        val query = "id=1"
        val url = getURL(endpoint, query)
        println(url)
    }

    // Function that returns a function
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
        val schema = if (ssl) "https://" else "http://"
        (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    def printMath() {
        println(math(50, 20, (x, y) => x + y))
    }

    // Function that takes a function as an argument
    def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

}