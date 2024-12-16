package classes

// inner class has access to the parent class values
class ACar(val model: String, val year: Int){
    inner class Engine {
        fun start(){
            println("Starting $model $year")
        }

        inner class Fuel(private val typeName: String) {
            fun fuelCar(){
                println("Fueling car $model, $year with $typeName")
                start()
            }
        }
    }
}

fun main() {
    val carEngine = ACar(model="Chevrolet Onix", year = 2021).Engine()
    val carEngineFuelType = carEngine.Fuel(typeName = "Gas")

    carEngineFuelType.fuelCar()
}