package OOP

class Deposit {
}

//class Person constructor(val firstName: String, val lastName: String, val age: Int?) {}

fun main(args: Array<String>) {
    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith", null)
    println("${person1.firstName},${person1.lastName} is  ${person1.age} years old")
    println("${person2.firstName},${person2.lastName} is  ${person2.age?.toString() ?: "?"} years old")

    //Person p = new Person("Jack", "Miller", 21);
    //System.out.println(String.format("%s, %s is %d age old",  p.getFirstName(), p.getLastName(), p.getAge()));

    val person3 = Person("Jane", "Smith")

}
