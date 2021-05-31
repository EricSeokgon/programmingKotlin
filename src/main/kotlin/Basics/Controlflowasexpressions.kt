package Basics

import java.io.IOException
import java.util.*

fun main() {
    "hello".startsWith("h")
    val a = 1

    val date = Date()
    val today = if (date.year == 2021) true else false
    println(today)

    fun isZero(x: Int): Boolean {
        return if (x == 0) true else false
    }
    println(isZero(0))

    val success = try {
        readLine()
        true
    } catch (e: IOException) {
        false
    }
}

