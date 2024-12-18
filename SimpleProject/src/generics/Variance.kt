package generics

open class CAnimal(val name: String)
class Dog : CAnimal(name = "Dog")
class Cat: CAnimal(name = "Cat")
class Bird : CAnimal(name= "Bird")

// Countervariance in (consumers)

class Feeder<in T: CAnimal> {
    fun feed(animal: T) {
        println("${animal.name} was fed.")
    }
}

// Covariance = out (producers)
open class Drink(val name: String)

class Juice: Drink(name = "Juice")
class Soda: Drink(name = "Soda")
class Coffee: Drink(name = "Coffee")

class Cup<out T: Drink> (val drink: T, val amount: Int) {
//   fun serve(drink: T) {
//       println("serving ${cup.amount} of ${cup.drink.name} ")
//   }
}

fun serveDrink(cup: Cup<Drink>) {
    println("serving ${cup.amount} of ${cup.drink.name} ")
}

fun main(){
    val catFeeder = Feeder<Cat>()
    val dogFeeder = Feeder<Dog>()

    catFeeder.feed(animal = Cat())
    dogFeeder.feed(animal = Dog())

    serveDrink(cup = Cup<Coffee>(drink = Coffee(), amount = 100))
    serveDrink(cup = Cup<Juice>(drink = Juice(), amount = 300))
}