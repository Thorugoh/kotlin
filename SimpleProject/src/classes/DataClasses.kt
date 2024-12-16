package classes

class UserClass(val name: String, val age: Int)

// needs at least one attribute being defined, they are incompatible with open method.
data class UserDataClass(val name: String, val age: Int)

fun main(){
    val userClass = UserClass(name = "João", age = 20)
    val userDataClass = UserDataClass(name = "João", age = 21)


    // toString
    println(userClass) // classes.UserClass@5b6f7412
    println(userDataClass) // UserDataClass(name=João, age=21)

    // equals
    val jose = UserDataClass(name = "Jose", age = 30)
    val jose2 = UserDataClass(name = "Jose", age = 30)
    val maria = UserDataClass(name = "Maria", age = 40)

    val userClass2 = UserClass(name = "João", age = 20)
    // data classes equals compares all values properties between each other
    println(jose == jose2)

    // classes will compare the instance resulting in false even when values are the same
    println(userClass2 == userClass)

    //copy method that exists only on data classes and copy all values to a new instance
    val copyMaria = maria.copy(age = 50) // passing a different value will copy all other values but the ones defined
    println(copyMaria)

    // destructuring
    // if passing a name that is not a value will destructure it in order
    val (name, age) = jose
    println("$name $age")
}