package collections

fun main () {
    // Immutable, array is fixed size
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val array2: Array<String> = arrayOf("1", "2", "3")

    println(" Array ")
   // println(array) -> // [Ljava.lang.Integer;@b4c966a
    println(array.joinToString(prefix = "[", postfix = "]", separator = " | "))
    println(array2.joinToString())

    val array3: Array<Int> = arrayOf(5, 6, 7, 8, 9, 10)

    // it will concatenate the arrays
    val arraySum = array + array3
    println(arraySum.joinToString())

    // List
    // Can be changed if mutable with different data types
    val list = listOf(1, 2, 3, "1", false)
    val mutableList = mutableListOf(1, 2, 3)

    println(" List ")
    mutableList.add(4)
    println(mutableList)

    val listInt: List<Int> = list.filterIsInstance<Int>()
    println(listInt)

    val listIntHigherThan2 = list.filter { it is Int && it > 2 }
    println(listIntHigherThan2)

    val listIntMessy = listOf(9, 18, 70, 1, 3, 750, 8, 16, 32_550, 2)
    val listStringMessy = listOf("Bernardo", "Alice", "Johnathan", "Roberto", "Clara")

    println(listIntMessy.sorted())
    println(listStringMessy.sorted())

    println(listIntMessy.reversed())
    println(listStringMessy.reversed())

    val intMax = listIntMessy.max()
    val intMin = listIntMessy.min()

    println(intMax)
    println(intMin)

    val findFirstOdd = list.find { it is Int && it % 2 != 0 }
    val findLastOdd = list.findLast { it is Int && it % 2 != 0 }

    println(findFirstOdd)
    println(findLastOdd)

    val booleanMapIntHigherThan10 = listIntMessy.map { it > 10 }
    println(booleanMapIntHigherThan10)
}