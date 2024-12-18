package challenges

enum class Bmi(val desc: String) {
    UNDERWEIGHT(desc = "Underweight"),
    OPTIMAL(desc = "Normal weight"),
    OVERWEIGHT(desc = "Overweight"),
    MODERATE_OBESITY(desc = "Moderate Obesity"),
    SEVERE_OBESITY(desc = "Severe Obesity"),
    MORBIDLY_OBESITY(desc = "Morbidly Obesity")

}

fun getDouble(prompt: String, rePrompt: String, isValid: (Double) -> Boolean): Double {
    println(prompt)
    val value = readlnOrNull()?.toDoubleOrNull();
    return when {
        value == null -> getDouble(prompt = rePrompt, isValid = isValid, rePrompt = rePrompt)
        !isValid(value) -> getDouble(prompt = rePrompt, isValid = isValid, rePrompt = rePrompt)
        else -> value
    }
}

fun calculateBmi(weight: Double, height: Double): Pair<Bmi, Double> {
    val result = weight / (height * 2)
    val bmi = when {
        result < 18.5 -> Bmi.UNDERWEIGHT
        result in 18.5..24.9 -> Bmi.OPTIMAL
        result in 25.0..29.9 -> Bmi.OVERWEIGHT
        result in 30.0..34.9 -> Bmi.MODERATE_OBESITY
        result in 35.0..39.9 -> Bmi.SEVERE_OBESITY
        else -> Bmi.MORBIDLY_OBESITY
    }

    return Pair(bmi, result)
}

fun main() {
    val weight = getDouble(
        prompt = "Insert your weight (e.g., 76.8):",
        rePrompt = "Please ensure you provided valid weight"
    ) { it > 0 && it < 300 }

    val height = getDouble(
        prompt = "Insert your height (e.g., 1.71):",
        rePrompt = "Please ensure you provided a valid height"
    ) { it > 0 && it < 3 }

    val (classification, value) = calculateBmi(height = height, weight = weight)
    println("Your bmi is: $value, and classification: ${classification.desc}")
}