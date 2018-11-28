object Main {

    def main(args: Array[String]): Unit = {
        val index = PolymorphicMethod.findFirst(Array(0, 1, 2, 3), (x: Int) => x == 2)
        println(index)
    }
    
}
