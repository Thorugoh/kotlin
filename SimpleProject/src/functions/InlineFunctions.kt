package functions

import generics.Drink

inline fun executeAction(action: () -> Unit) {
    println("Starting action...")
    action()
    println("Finishing action...")
}

inline fun<reified T> printTypeName(){
    println(T::class.simpleName)
}

open class Drink(val name: String)

class Juice: Drink(name = "Juice")
class Soda: Drink(name = "Soda")
class Coffee: Drink(name = "Coffee")

class Cup<out T: Drink> (val drink: T, val amount: Int) {
//   fun serve(drink: T) {
//       println("serving ${cup.amount} of ${cup.drink.name} ")
//   }
}

inline fun <reified T : Drink>serveDrink(cup: Cup<T>) {
    println("[${T::class.simpleName}] serving ${cup.amount} of ${cup.drink.name} ")
}

fun main() {
    executeAction {
        println("Exectuing action...")
    }

    printTypeName<String>()
    printTypeName<Int>()

    val juice = Juice()
    val juiceCup = Cup(drink = juice, amount = 500)
    serveDrink(cup = juiceCup)
}