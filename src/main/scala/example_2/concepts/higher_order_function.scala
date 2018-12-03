package concepts

object HigherOrderFunction {

    // printURL prints an example url
    def printURL() {
        val domainName = "www.example.com"
        def getURL = urlBuilder(ssl=false, domainName)
        val endpoint = "users"
        val query = "id=1"
        val url = getURL(endpoint, query)
        println(url)
    }

    // urlBuilder is a function that returns a function
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
        val schema = if (ssl) "https://" else "http://"
        (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    // printMath adds two numbers together
    def printMath() {
        println(math(50, 20, (x, y) => x + y))
    }

    // math is a function that takes a function as an argument
    def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

    // displayHigherOrderFunctionData displays the data
    def displayHigherOrderFunctionData() {
        printURL()
        printMath()
    }

}
