package challenges

enum class Fuel {
    GASOLINE,
    ETHANOL,
    EITHER
}

fun getBestFuel(gasolinePrice: Double, ethanolPrice: Double): Fuel {
    val quotient = ethanolPrice / gasolinePrice
    return when {
        quotient > 0.7 -> Fuel.ETHANOL
        quotient < 0.7 -> Fuel.GASOLINE
        else -> Fuel.EITHER
    }
}

fun promptForPrice(prompt: String): Double? {
    println(prompt)
    print("R$: ")
    return readlnOrNull()?.toDoubleOrNull()
}


fun main(){
    val gasolinePrice = promptForPrice("Insert gasoline price/l (e.g., 5.29)")
    val ethanolPrice = promptForPrice("Insert ethanol price/l (e.g., 5.29)")

    if(gasolinePrice == null || ethanolPrice == null) {
        println("Inserted input. Please ensure you provided valid numbers")
        return
    }

    val bestFuel = getBestFuel(gasolinePrice = gasolinePrice, ethanolPrice = ethanolPrice)

    println(
        when (bestFuel) {
            Fuel.ETHANOL -> "Choose Ethanol. It offers best cost-benefit"
            Fuel.GASOLINE -> "Choose Gasoline. It offers best cost-benefit"
            else -> "Both fuels have the same cost-benefit."
        }
    )
}