package data_type_details

fun main () {
    val age: Int = 20

    // add months in decimal format to the age int (convert age in a data type floating number)
    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12

    println("ageDouble: $ageDouble monthPercent = $monthPercent")

    // 2 months later...

    ageDouble += 2 * monthPercent

    println("ageDoubleUpdated: $ageDouble")


    // show age on string format with pattern "Age is x years old"

    val ageText: String = "Age is " + ageDouble.toString().plus(" years old.")

    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())
}