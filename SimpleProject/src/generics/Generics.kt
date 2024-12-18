package generics

fun <Item> printItem(item: Item) {
    println(item)
}

fun <T: Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

data class Product(val name: String, val amount: Int)

class Container<T>(val items: List<T>) : ItemsPrinter<T>, Comparable<Container<T>> {
    fun showItems() {
        println(
            """
                Container items: 
                ${items.joinToString()}
            """.trimIndent()
        )
    }

    override fun printItem(item: T) {
        println("Item: $item")
    }

    override fun compareTo(other: Container<T>): Int {
        if(this.items.size == other.items.size) return 0
        if(this.items.size > other.items.size) return 1
        return -1
    }
}

interface ItemsPrinter<T> {
    fun printItem(item: T)
}

fun <T>List<T>.secondOrNull() : T? {
    return if (this.size >= 2) this[1] else null
}

fun main() {
    printItem(item = "Kotlin")
    printItem(item = true)
    printItem(item = 1)
    printItem(item = object {
        val name: String = "Hello"
        val x: Double = 100.0
    })

    val container1 = Container(items = listOf(
        Product("orange", 10),
        Product("Apple", 20)
    ))

    val container3 = Container(items = listOf(
        Product("orange", 10),
        Product("Apple", 20)
    ))

    val container2 = Container(items = listOf("Orange", "Apple"))

    container1.showItems()
    container2.showItems()

    container2.printItem(item = container2.items.first())
    println(container2.items.secondOrNull())

    println(findMax(a = "hello", b = "kotlin"))
    println(findMax(a = 10, b = 100))

    println(findMax(a = container1, b = container3))


}