package Basics

fun main() {
    fun whatNumber(x: Int) {
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is 1")
            else -> println("X is neither 0 or 1")
        }
    }

    fun isMinOrMax(x: Int): Boolean {
        val isZero = when (x) {
            Int.MIN_VALUE -> true
            Int.MAX_VALUE -> true
            else -> false
        }
        return isZero
    }

    fun isZeroOrOne(x: Int): Boolean {
        return when (x) {
            0, 1 -> true
            else -> false
        }
    }

    fun isAbs(x: Int): Boolean {
        return when (x) {
            Math.abs(x) -> true
            else -> false
        }
    }

    fun isStringleDigit(x: Int): Boolean {
        return when (x) {
            in -9..9 -> true
            else -> false
        }
    }

    fun isDieNumber(x: Int): Boolean {
        return when (x) {
            in listOf(1, 2, 3, 4, 5, 6) -> true
            else -> false
        }
    }

    fun startWithFoo(any: Any): Boolean {
        return when (any) {
            is String -> any.startsWith("Foo")
            else -> false
        }
    }

    fun whenWithoutArgs(x: Int, y: Int) {
        when {
            x < y -> println("x is less than y")
            x > y -> println("X is greater than y")
            else -> println("X must equal y")
        }
    }



}