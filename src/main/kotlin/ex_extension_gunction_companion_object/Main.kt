package ex_extension_gunction_companion_object

class Person {
    companion object
}

fun Person.Companion.create() = Person()

fun main(args: Array<String>) = Person.create()