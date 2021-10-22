package part4.ex_kotlin_collection

fun main(args: Array<String>) {
    val list: Collection<Int> = listOf(10, 20, 30)
    val set: Collection<Int> = setOf(1, 2, 3, 2, 3)
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(list)
    println(set)
    println(map)
}