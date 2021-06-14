package Functions

class Defining {
    fun hello(): String = "hello world"
    fun hello(name: String, location: String): String = "hello to you $name at $location"
    fun print1(str: String): Unit {
        println(str)
    }

    fun print2(str: String) {
        println(str)
    }
}

