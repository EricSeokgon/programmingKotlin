package ex_nullalbe_receiver

fun String?.isNumber() {
    if (this == null)
        print("문자열이 null 입니다.")
}

fun main(args: Array<String>) {
    val empty: String? = null
    empty.isNumber()
}