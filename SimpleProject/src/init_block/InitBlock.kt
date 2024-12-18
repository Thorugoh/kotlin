package init_block

class AnotherPerson(val name: String, val age: Int) {
    init {
        require(name.isNotBlank()) {
            "Name cannot be empty"
        }
        println("Person created: $name, age: $age")
    }
}

class Car(val brand: String, val model: String) {
    var year: Int = 0



    constructor(brand: String, model: String, year: Int): this(brand, model) {
        this.year = year
        println("Car year defined: $year")
    }

    // it starts before secondary constructor
    init {
        println("Starting car")
    }
}
fun main() {
//    val ana = AnotherPerson("Ana", 23)
    val uno = Car(brand = "Fiat", model = "uno", year = 1997)
}
