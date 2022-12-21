package k

class House

class Person(name: String, age: Int, level: Int){
    val name = name
    val age = age
    var level = level
}

fun main() {
    val body: Person = Person("Maxim", 12, 5)
    val body2: Person = Person("Julian", 25, 6)

    val maison: House = House()

    println("${body.name}, ${body.age}")
    println("${body2.name}, ${body2.age}")
    body.level = 9
    body2.level = 12

    println("${body.level}, ${body2.level}")
}