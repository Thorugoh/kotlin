package args_alidation

import typealiases.processScore


// require

fun divide(a: Int, b: Int): Int {
    require(b != 0) {
        "cannot / by zero"
    }
    return a / b;
}

// requireNotNull
 fun printName(name: String) {

     val nameNotNull = requireNotNull(name) { "Name was not defined." }
    println(nameNotNull)
 }

// check
fun processList(list: List<Int>) {
    check(list.isNotEmpty()) { "List cannot be processed, there is no item inserted" }
    println("Processing list with size ${list.size}")

    check(list.any {it == 0}) { "Student is reproved due to a score 0." }
    println("AVG is ${list.sum() / list.size}")
}

fun main() {
//    println(divide(1, 2))
//    println(divide(3, 0))

//    println(printName("Victor"))
//    println(printName(null))

    processList(listOf(1, 3, 4 ,5, 6))
//    processList(listOf())
    processList(listOf(1, 3, 4 ,0, 6))

}
