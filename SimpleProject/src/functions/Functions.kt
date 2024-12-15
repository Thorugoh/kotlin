package functions

fun isEven(num: Int): Boolean{
    return num % 2 == 0
}

fun main() {
    val num = 4
    println("is $num even? ${isEven(num = num)}" )
}