package classes


sealed interface BAnimal {
    // no need to instance interface BAnimal
    data class Dog(val breed: String): BAnimal {
        override val x: Int
            get() = super.x * 2

        override fun sound(): String {
            return "Au!"
        }
    }

    data class Cat(val color: String): BAnimal {
        override fun sound(): String {
            return "Miau!"
        }

    }

    data object Bird: BAnimal {
        override fun sound(): String {
            return "Piu!"
        }

    }

    fun sound(): String
    val x: Int
        get() = 10
}

// Sealed classes cannot be inherited by other scopes
sealed class Result(val y: Int) {
    data class Success(val data: String) : Result(y = 20)
    data class Error(val exception: Exception): Result(y = 20)
    data object Loading: Result(y = 20)

    // needs abstract to request an implementation
//    abstract fun x(): String

//    abstract val x: Int

}

fun handleResult(result: Result) {
    println(
        when(result) {
            is Result.Error -> "There was an error! ${result.exception.message}"
            Result.Loading -> "Loading..."
            is Result.Success -> "Success! ${result.data}"
        }
    )
}

object Database {
    fun getContacts(): Result {
        return Result.Success(data = listOf("Victor", "João", "José", "Maria").joinToString())
    }

    fun insertContact(contact: String): Result {
        return Result.Error(exception = IllegalArgumentException("The inserted contact has invalid chars."))
    }

    fun updateContact(id: Int, newContact: String): Result {
        return Result.Loading
    }
}

fun handleAnimal(animal: BAnimal) {
    println(
        when(animal) {
            is BAnimal.Cat -> "It's a cat, its sound is ${animal.sound()} and its color is ${animal.color}"
            is BAnimal.Dog -> "It's a dog, its sound is ${animal.sound()} and its breed is ${animal.breed}"
            BAnimal.Bird -> "It's a bird, its sound is a ${animal.sound()}"
        }
    )
}

fun main() {
    val contacts: Result = Database.getContacts()
    val isContactInserted: Result = Database.insertContact("Fernando")
    val isUpdated: Result = Database.updateContact(id = 1, newContact = "Fernando")

    handleResult(contacts)
    handleResult(isContactInserted)
    handleResult(isUpdated)

    val dog = BAnimal.Dog(breed = "Poodle")
    val bird = BAnimal.Bird
    handleAnimal(dog)
    handleAnimal(bird)
}