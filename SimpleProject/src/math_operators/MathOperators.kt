package math_operators

//import kotlin.math.ceil
//import kotlin.math.log10
//import kotlin.math.pow
//import kotlin.math.round

fun main(){
    val x = 4
    val y = 2

    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y)

    var a = 10
    var b = 20

    // increment / decrement

    a++
    b--

    println(a)
    println(b)

    // compose attribution

    var num5 = 1
    num5 += 2 // 3 (1 + 2)
    num5 -= 1 // 2 (3 - 1)
    num5 *= 4 // 8 (2 * 4)
    num5 /= 2 // 4 (8 / 2)

    // Math lib
    // Math is a Java library all that can be done in kotlin

    val value = 2.567
    val valueRounded = Math.round(value) // 3.0
//    val valueRounded = round(value) // Kotlin approach

    val valueFloor = Math.floor(value) // 2.0 rounds always down
    // val valueFloor = floor(value) // Kotlin approach

    val valueCeil = Math.ceil(value) // 3.0 rounds always up
    // val valueCeil = ceil(value) // Kotlin approach

    val base = 2.0
    val exponent = 3.0
    val valuePow = Math.pow(base, exponent) // 2 ^ 3 = 2 * 2 * 2 = 8.0
//    val valuePow = base.pow(exponent) // Kotlin approach


    val logValue = Math.log10(100.0) // 10 * 10 -> 2
//    val logValue = log10(100.0) // Kotlin approach


}