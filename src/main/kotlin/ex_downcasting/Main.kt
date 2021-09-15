package ex_downcasting

import ex_upcasting.Person
import ex_upcasting.Strudent

fun main(args: Array<String>) {
    val person: Person = Strudent("John", 32, 20171225)
    val person2: Person = Person("Jack", 29)

    var person3: Strudent = person as Strudent
    person3 = person2 as Strudent
}