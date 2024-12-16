package classes

class BPerson {
    companion object {
        const val KEY = "12345678"
        private const val KEY_2 = "1234567892"
    }

    fun getKey(): String {
        return KEY_2
    }
}

fun main() {
    val key = BPerson.KEY
//    val key2 = BPerson.KEY_2 -> cannot access, it's private
    val jose = BPerson()
//    jose.KEY -> Wont have access to KEY

}