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

fun fizzbuzz(start: Int, end: Int): Unit {
    for (k in start..end) {
        if (k % 3 == 0 && k % 5 == 0)
            println("Fizz Buzz")
        else if (k % 3 == 0)
            println("Fizz")
        else if (k % 5 == 0)
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz2(start: Int, end: Int): Unit {

    fun isFizz(k: Int): Boolean = k % 3 == 0
    fun isBuzz(k: Int): Boolean = k % 5 == 0

    for (k in start..end) {
        if (isFizz(k) && isBuzz(k))
            println("Fizz Buzz")
        else if (isFizz(k))
            println("Fizz")
        else if (isBuzz(k))
            println("Buzz")
        else
            println(k)
    }
}

