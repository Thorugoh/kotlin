package late_init

import kotlin.properties.Delegates

fun main(){
    // lateinit
    lateinit var a: String

    //println(a) -> lateinit property a has not been initialized
    a = "kotlin lateinit"
    println(a)

    // lazy -> The value will be assigned only when it's usesd for the first time
    val b: String by lazy {
        "kotlin lazy"
    }
    println(b)

    // lateinit cannot be used in variables with primitive types for that, use by Delegates
    var c: Int by Delegates.notNull()
    var d: Boolean by Delegates.notNull()
    var e: Double by Delegates.notNull()

    // println(c) -> Property c should be initialized before get.
    c = 10
    println(c)

}