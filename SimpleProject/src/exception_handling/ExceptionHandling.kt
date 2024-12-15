package exception_handling

import java.security.InvalidParameterException

fun main() {

    //  try / catch

    var x = 1
    try {
        // code to be executed by the program
        x = 2
    } catch (e: Exception) {
        // can an exception happens on try block
        x = 3
    } finally {
        // always executed regard the result
        x = 4
    }
    println(x)

    var y = 1
    y = try {
        // code to be executed by the program
        // throw InvalidParameterException()
        1 / 0
    } catch (e: ArithmeticException) {
        // can an exception happens on try block
        println(e.message)
        println(e::class.java)
        3
    } catch (e: Exception) {
        println("Generic error")
        7
    }

    println(y)
}