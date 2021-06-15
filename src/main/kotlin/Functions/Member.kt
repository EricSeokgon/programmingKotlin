package Functions

fun main() {
    val string = "hello"
    val length = string.take(5)
}

object Rectangele {
    fun printArea(width: Int, height: Int): Unit {
        val area = calculateArea(width, height)
        println("the area is $area")
    }

    private fun calculateArea(width: Int, height: Int): Int {
        return width * height
    }
}
