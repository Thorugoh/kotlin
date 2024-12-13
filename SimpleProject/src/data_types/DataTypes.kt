package data_types

fun main() {
    // numbers

    // 8 bits resolution integer number (-128 to 127)
    val byte: Byte= -128

    // 16 bits resolution integer number (-32768 to 32767)
    val short: Short = 32_767

    // 32 bits resolutions integer number (-2^31 to 2^31-1)
    val int: Int =  Int.MAX_VALUE // || 2_147_483_647

    // 64 bits resolution integer number
    val long: Long = Long.MAX_VALUE // 9223372036854775807L

    // needs to specify f at the end to define its float type

    val float: Float = 3.14f // 32 bits resolution number
    val double: Double = 3.0 // 64 bits resolution number

    // text
    val char: Char = 'A' // needs to use simple quotes
    val string: String = "Victor Hugo"
    val breakLineString: String = """
        can represent long texts
        breaking lines
    """.trimIndent() // trimIndent remove blank spaces on start and end
    val interpolation: String = "$char $byte $short"

    // boolean
    val bool: Boolean = true // false


}