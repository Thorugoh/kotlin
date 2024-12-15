package functions

fun sum(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main(){
    val divide = { a: Int, b: Int -> a / b }
    // using :: to pass function reference
    println(mathOperation(10, 5, ::sum))
    println(mathOperation(10, 5, ::subtract))
    println(mathOperation(10, 5, ::multiply))
    println(mathOperation(10, 5, divide))
}