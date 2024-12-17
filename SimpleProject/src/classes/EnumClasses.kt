package classes

enum class Direction(val description: String) {
    NORTH(description = "North direction") { // 0
        override fun symbol(): Char {
           return '↑'
        }

        override val symbol: Char
            get() = '↑'
    },
    SOUTH(description = "South direction") { // 1
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    },
    EAST(description = "East direction") {  // 2
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    },
    WEST(description = "West direction") { // 3
        override fun symbol(): Char {
           return '→'
        }

        override val symbol: Char
            get() = '→'
    };

    companion object {
        fun sumDirection(firstDirection: Direction, secondDirection: Direction) {
            println(firstDirection.description)
            println(secondDirection.description)
        }
    }

    fun addDirection(direction: Direction) {
        println(this.description)
        println(direction.description)
    }

    abstract fun symbol(): Char
    abstract val symbol: Char
}

fun main(){
    val north = Direction.NORTH

    println(north.name)
    println(north.ordinal)
    println(north.description)

    north.addDirection(direction = Direction.EAST)
    Direction.sumDirection(firstDirection = Direction.SOUTH, secondDirection = Direction.WEST)

    Direction.entries.forEach {
        println(it.symbol() + " | " + it.symbol)

    }

    //valueOf
    println(Direction.valueOf(value = "SOUTH").ordinal)

}