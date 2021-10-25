package part4.ex_mutable_set_interface

fun main(args: Array<String>) {
    val set: MutableSet<Int> = mutableSetOf(1, 4, 7)
    println(set)

    println(set.add(5))
    println(set)

    println(set.addAll(listOf(3, 7)))
    println(set)
}