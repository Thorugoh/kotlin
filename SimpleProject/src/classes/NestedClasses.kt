package classes

// it can be done in dta classes and objects as well
// in nested classes we do not have access to the parent class values
class Car(val model: String, val year: Int) {
    object Engine {
        data class FuelType(val typeName: String){
            fun fuelCar(){
                println("Fueling car with $typeName")
            }
        }

        fun start(){
            println("Starting...")
        }
    }
}

fun main() {
    val car = Car(model = "Chevrolet Onix", year = 2021)
    val carEngine = Car.Engine
    val fuelType = Car.Engine.FuelType("gasoline")
}