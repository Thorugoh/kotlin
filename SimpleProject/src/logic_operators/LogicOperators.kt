package logic_operators

fun main() {
    val a = true
    val b = false
    val c = true

    // operator AND (&&)

    val result = a && b // returns false (both needs to be true)
    val result2 = a && c // returns true

    // operator OR (||)

    val result3 = a || b // returns true
    val result4 = a || c // returns true

    // operator NOT (!) - it inverts the value
    val e = true
    val f = !e // returns false

    // Equality (==)
    val num1 = 10
    val num2 = 5

    println(num1 == num2) // false

    // Inequality (!=)
    println(num1 != num2) // true

    // Operator is type of and is not type of (is !is)
    val num: Any = 1
    val numText: Any = "1"

    println(num is String) // false
    println(numText is String) // true

    println(num !is String) // true
    println(numText !is String) // false

    // operator (in !in)
    val range = 1..10
    val x = 5
    val y = 15

    println(x in range) // true
    println(y in range) // false

    println(x !in range) // false
    println(y !in range) // true
}