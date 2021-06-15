package Functions


fun printArea(width: Int, height: Int) {
    fun calculateArea(width: Int, height: Int): Int = width * height
    val area = calculateArea(width, height)
    println("The area is $area")
}

fun printArea2(width: Int, height: Int) {
    fun calculateArea(): Int = width * height
    val area = calculateArea()
    println("The area is $area")
}

