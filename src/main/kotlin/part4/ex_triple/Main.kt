package part4.ex_triple

fun calcuateCircle(radius: Int): Triple<Int, Double, Double> =
    Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

fun main(args: Array<String>) {
    val (diamaeter, _, area) = calcuateCircle(5)
    println("지름:$diamaeter")
    println("넓이:$area")
}