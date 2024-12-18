package functions

fun main() {
    var sum = 2 + 2


    val funSum = { a: Int, b: Int ->
        {
            sum = 100
            a + b
        }
    }

    println(funSum(1, 2).invoke())
    println(sum)

    val funcao = fun(a: Int, b: Int): Int {
        return a + b
    }

    fun String.reversa(): String {
        return this.reversed()
    }
    println("Kotlin".reversa())
}