package Basics

fun main() {
    var str: String? = null
    //var str1: String = null

    fun isString(any: Any): Boolean {
        return if (any is String) true else false
    }

    fun printStringLength(any: Any) {
        if (any is String) {
            println(any.length)
        }
    }

    fun isEmptyString(any: Any): Boolean {
        return any is String && any.length == 0
    }

    fun isNotStringOrEmpty(any: Any): Boolean {
        return any !is String || any.length == 0
    }


}