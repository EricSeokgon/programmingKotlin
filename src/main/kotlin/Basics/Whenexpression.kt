package Basics

import sun.security.action.GetBooleanSecurityPropertyAction

fun main() {
    fun whatNumber(x: Int) {
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is 1")
            else -> println("X is neither 0 or 1")
        }
    }

    fun isMinOrMax(x: Int): Boolean {
        val isZero=when(x){
            Int.MIN_VALUE->true
            Int.MAX_VALUE->true
            else->false
        }
        return isZero
    }

    fun isZeroOrOne(x:Int):Boolean{
        return when (x) {
            0, 1 -> true
            else -> false
        }
    }

}