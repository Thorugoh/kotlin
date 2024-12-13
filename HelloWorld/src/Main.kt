//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter your name: ")
    val name = readln()

    println("Hello $name")

    println("Enter your age: ")
    val age = readln().toInt()

    for(i in 1..age) {
        val ageText = if (i == age) "Your age is $i!" else "$i..."
        println(ageText)
    }

}