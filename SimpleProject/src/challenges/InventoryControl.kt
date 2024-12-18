package challenges

// define product structure
// structure product inventory (class ProductInventory)
// build menu
// data input functions
// menu execution logic

data class Product(val id: Int, val name: String, val amount: Int, val price: Double)

interface Inventory<T> {
    fun insert(item: T)
    fun delete(id: Int) : Boolean
    fun getItem(id: Int): T?
    fun getAll() : List<T>
    fun update(item: T): Boolean
}
class ProductInventory: Inventory<Product> {
    private val products = mutableListOf<Product>();

    override fun insert(item: Product) {
        products.add(item)
    }

    override fun delete(id: Int): Boolean {
        return products.removeIf { it.id == id}
    }

    override fun getItem(id: Int): Product? {
        return products.find { it.id == id }
    }

    override fun getAll(): List<Product> {
        return products.toList()
    }

    override fun update(item: Product): Boolean {
        if (products.removeIf { it.id == item.id }){
            products.add(item)
            return true
        }
        return false
    }
}

inline fun <reified T>getValueFromUser(prompt: String): T {
    var input: String?;

    do {
        println(prompt)
        input = readlnOrNull()
    } while (input == null);

    return when (T::class) {
        Int::class -> input.toIntOrNull() as T
        Double::class -> input.toDoubleOrNull() as T
        String::class -> input as T
        else -> {
            throw UnsupportedOperationException("Unsupported generic type: ${T::class}")
        }
    }

}

fun fillProduct(): Product {
    try {
        val productId = getValueFromUser<Int>("Enter product id: ")
        val productName = getValueFromUser<String>("Enter product Name: ")
        val price = getValueFromUser<Double>("Enter the price: (e.g., 17.23)")
        val amount = getValueFromUser<Int>("How many products do you want to add?: ")

        return Product(id = productId, name = productName, price = price, amount = amount)

    } catch (e: Exception) {
        println("Error adding value. try again")
        return  fillProduct();
    }


}

fun updateProduct(): Product {
    println("Updating Product")
    return fillProduct()
}

fun deleteProduct(): Int {
    println("Deleting Product")
    return getValueFromUser<Int>("Product Id to be deleted:");
}

fun searchProductById(): Int {
    println("Searching Product")
    return getValueFromUser<Int>("Prodct ID you want to search:");
}


fun main(){
    val productInventory = ProductInventory()
    var action: Int? = null
    while (action != 5) {
        //https://tableconvert.com/ascii-generator
        println(
            """
            +-------------------+
            | Product Inventory |
            +-------------------+
            | 1 - Insert        |
            | 2 - Update        |
            | 3 - Delete        |
            | 4 - Search        |
            | 5 - Quit          |
            +-------------------+
        """.trimIndent()
        )
        println("Products in inventory:")
        println(productInventory.getAll().joinToString(separator = "\n").ifEmpty {
            "No product was added so far."
        })
        print("-> ")
        action = readlnOrNull()?.toIntOrNull()

        when(action) {
            1 -> {
                val product = fillProduct()
                productInventory.insert(product)
            }
            2 -> {
                val product = updateProduct()
                productInventory.update(product)
            }
            3 -> {
                val productId = deleteProduct()
                productInventory.delete(productId)
            }
            4 -> {
                val productId = searchProductById()
                println(productInventory.getItem(productId))
            }
            5 -> {
                println("Thank you.")
            }
            else -> {
                println("Invalid option. Try again")
            }
        }
    }

}