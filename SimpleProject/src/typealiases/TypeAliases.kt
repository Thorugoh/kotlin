package typealiases

typealias Operation = (Int, Int) -> Int

typealias Scores = List<Int>
typealias Name = String
typealias StudentMap = Map<Name, Scores>

fun mathOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

fun processScore(studentMap: StudentMap) {
    for((name, scores) in studentMap) {
        println("Student $name | Scores: ${scores.joinToString()}")
    }
}

fun main() {
    val students = mapOf(
        "Alice" to listOf(5, 6, 8),
        "Bruno" to listOf(4, 7, 20)
    )

    processScore(students)
}