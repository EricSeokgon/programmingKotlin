package ex_enum_class_members

enum class Mode(val number: Int) {
    SELECTION(0),
    PEN(1),
    SHAP(2),
    EARSER(3);

    fun printNumber() {
        println("모드:$number")
    }
}

fun main(args: Array<String>) {
    //현재 선택된 모드
    val mode: Mode = Mode.EARSER

    println(mode.number)
    mode.printNumber()
}
