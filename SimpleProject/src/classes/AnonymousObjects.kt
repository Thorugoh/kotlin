package classes

interface ClickCallback {
    fun onclick()
}

fun main() {

    val x = 10

    val objectTemp =  object {
        val property1: Int = 1
        val property2: String = "Kotlin"

        fun method1(){
            println(x)
        }
    }

    objectTemp.method1()

    val buttonClickCallback = object : ClickCallback {
        override fun onclick() {
            println("clicking button")
        }
    }

    buttonClickCallback.onclick()
}