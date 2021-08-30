package ex_indexed_access_operator

fun main(args: Array<String>) {
    val person = Person("Kotlin", "2021-08-30")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java"
    println(person.name)
}