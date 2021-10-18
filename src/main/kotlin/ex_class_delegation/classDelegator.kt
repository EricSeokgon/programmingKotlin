package ex_class_delegation

class classDelegator : Plusable {
    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}