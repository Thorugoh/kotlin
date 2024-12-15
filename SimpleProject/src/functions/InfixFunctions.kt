package functions

// to create a infix functions can only be member functions or extension, and accept one param
// cannot receive var args, or default value
infix fun Int.sum(num: Int): Int = this + num
class XY(val x: Int, val y: Int){
    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x, y = this.y + xy.y)
    }
}

fun main(){
    println(5 sum 2)

    val xy = XY(x=1,y=2) sum XY(x=2, y=4)
    println(xy.x)
    println(xy.y)
}