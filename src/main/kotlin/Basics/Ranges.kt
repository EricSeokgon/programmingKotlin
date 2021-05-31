package Basics

fun main() {
    val aToZ = "a".."z"
    println(aToZ)

    val oneToNine = 1..9
    println(oneToNine)

    val isTrue = "c" in aToZ
    println(isTrue)

    val isFalse = 11 in oneToNine
    println(isFalse)

    val countingDown = 100.downTo(0)
    println(countingDown)

    val rangeTo = 10.rangeTo(20)
    println(rangeTo)

    val oneToFifty = 1..50
    println(oneToFifty)

    val oddNumbers = oneToFifty.step(2)
    println(oddNumbers)

    val countingDownEvenNumbers = (2..100).step(2).reversed()
    println(countingDownEvenNumbers)
}