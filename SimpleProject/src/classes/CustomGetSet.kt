package classes

class APerson(
    val name: String
) {
    var age: Int = 0
        set(value) {
            if(value >= 0) field = value
            else println("Age cannot be negative.")
        }
    var height: Double = 0.0
        get() = Math.ceil(field)
}

fun main(){
    val joao = APerson(name = "João")
    joao.age = 30
    joao.height = 175.9

    println(joao.age)
    println(joao.height)

    joao.age = -10
}