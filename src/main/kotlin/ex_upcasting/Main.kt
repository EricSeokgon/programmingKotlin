package ex_upcasting

open class Person(val name: String, val age: Int)

class Strudent(name: String, age: Int, val id: Int) : Person(name, age)

fun main(args: Array<String>) {
    val person: Person = Strudent("John", 32, 20210903)
}