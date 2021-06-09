package OOP

import java.sql.Connection

class Person(val firstName: String, val lastName: String, val age: Int?) {
    init {
        require(firstName.trim().length > 0) { "Invalid firstName argument." }
        require(lastName.trim().length > 0) { "Invalid lastName argument." }
        if (age != null) {
            require(age >= 0 && age < 150) { "Invalid age argument." }
        }
    }
    constructor(firstName: String, lastName: String) :  this(firstName, lastName, null)
}

class Database internal constructor(connection: Connection) {
}
