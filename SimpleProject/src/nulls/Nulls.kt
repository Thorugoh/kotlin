package nulls

fun main() {
    // ? indicates type or null
    var a: String? = null

    //val result: String = a // type mismatch

    val result = a ?: "kotlin" // receives "kotlin" in case a is null
    println(result)

    // safe call
    var b: Int = -1
    b = a?.toInt() ?: 5 // verify for null before calling toInt, case is null b receices 0
    println(b)


    // non null assertion (DANGEROUS, avoid it)
    a = "1"
    if( a != null){
        println(a!!.toInt())
    }

    // safe cast -> returns null case format doesnt suceed
    val c = a as? Int
    println("c: " + c)

    // let -> safe block
    b?.let {
        println(it)
    }

}