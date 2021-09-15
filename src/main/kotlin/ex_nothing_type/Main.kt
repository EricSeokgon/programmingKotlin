package ex_nothing_type

fun throwing(): Nothing = throw Exception()

fun main(args: Array<String>) {
    println("start")
    val i: Int = throwing()
    println(i)
}

fun validate(num: Int) {
    val result: Int =
        if (num >= 0) num
        else throw Exception("num이 음수입니다.")
}