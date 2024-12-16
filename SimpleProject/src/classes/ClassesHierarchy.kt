package classes

open class Animal(val name: String){
    open val age: Int = 0
    open fun sound() {
        println("$name: som")
    }
}

class Dog(override val age: Int) : Animal(name = "Dog") {

    override fun sound(){
        println("$name: AU!")
    }
}

fun main(){
    val dog = Dog(5)
    dog.sound()
    println(dog.age)
}