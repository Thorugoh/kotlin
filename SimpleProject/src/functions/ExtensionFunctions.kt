package functions

fun String.isPalindrome() : Boolean {
    return this == this.reversed()
}

fun Double.format(decimalDigits: Int): String {
    return  "%.${decimalDigits}f".format(this)
}

fun main() {
    println("radar".isPalindrome())
    println("banana".isPalindrome())

    println(20.89765.format(2))
}