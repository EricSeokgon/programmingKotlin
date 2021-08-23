package ex_class

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {
    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2 = Person()
    person.name = "홍길동"
    person.age = 36

    val person3 = Person()
    person.name = "홍길동"
    person.age = 36
}