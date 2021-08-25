package ex_property_constructor

class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>) {
    val car = Car("My Cae")
    println(car.name)
    println(car.speed)

}