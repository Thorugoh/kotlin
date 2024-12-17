package classes

abstract class Vehicle(val color: String) {
    abstract val maxSpeed: Int
    abstract val wheelsAmount: Int

    abstract fun startMovement()
    fun info() {
        println(""" 
            Max speed = $maxSpeed Km/h
            Wheels = $wheelsAmount
        """.trimIndent())
    }
}

class CCar(color: String, val model: String, val year: Int) : Vehicle(color) {
    override val maxSpeed: Int
        get() = 150
    override val wheelsAmount: Int
        get() = 4

    override fun startMovement() {
        println("Starting engine")
    }


    override fun toString(): String {
        super.info()
        return "$model, $year"
    }
}

class Bike(color: String): Vehicle(color = color) {
    override val maxSpeed: Int
        get() = 40
    override val wheelsAmount: Int
        get() = 2

    override fun startMovement() {
       println("Cycling...")
    }
}

fun main(){
    val car = CCar(color = "White", year = 2024, model = "Chevrolet Onix")

    val bike = Bike(color = "Red")

    println(car)
    println(bike.maxSpeed)
    println(bike.wheelsAmount)
    bike.info()
}