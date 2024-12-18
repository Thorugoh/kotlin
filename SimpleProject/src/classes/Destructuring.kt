package classes

data class CPerson(val name: String, val lastname: String, val age: Int)

class CAnimal(val name: String, val age: Int){
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    val (name, lastname, age) = CPerson(name = "José", lastname = "Silva", age = 40)

    val (a, b) = Pair<String, String>("a", "b")
    val (c, d, e) = Triple<Int, Boolean, Double>(10, false, 5.0)

    name
    lastname
    age
    a
    b
    c
    d
    e

    val (n, s) = CAnimal(name ="Dog", age =3)
}