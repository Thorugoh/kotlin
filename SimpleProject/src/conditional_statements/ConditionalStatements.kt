package conditional_statements

fun main(){
    val x = 100
    val y = 50

    if(x > y){
        println("x > y")
    }else if(x < y){
        println("x < y")
    } else if(x == y){
        println("x == y")
    } else {
        println("else")
    }

    // assign if result to var / val

    val result = if(x > y){
        "x > y"
    }else if(x < y){
        "x < y"
    } else if(x == y){
        "x == y"
    } else {
        "else"
    }

    println(result)

    // when

    val result2 = when(x) {
        in 1..100 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }
    println(result2)

    val result3 = when(y) {
        in 1..100 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }

    println(result3)

}