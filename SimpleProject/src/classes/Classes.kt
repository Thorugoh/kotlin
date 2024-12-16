package classes

import kotlin.random.Random

class Person(val name:  String = "Unknown", val lastName: String, val age: Int = 0) {
    val fullName: String = "$name $lastName"
    private val password: String = name + Random.nextInt(100)

    private fun usePassword() {
        println(password)
    }


    fun work(){
        usePassword()
        println("$name, $age yo is working...")
    }
}

fun main(){
    val victor: Person = Person(name = "Victor", lastName = "Oliveira", age = 28)
    val tai: Person = Person(name = "Tai", lastName = "Rodrigues")

    victor.work()
    tai.work()

    println(victor.fullName)
    println(tai.fullName)

//    victor.usePassword -> not accessible since its private
}