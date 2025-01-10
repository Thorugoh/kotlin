import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

// Objective: house construction, workers operating to build it.
// Build walls
// Install doors
// Create roof

enum class BuildingMaterial(val description: String, val deliveryTimeInMillis: Long) {
    DOORS("DOORS", 500),
    WINDOWS("WINDOWS", 1_000),
    ROOF("ROOF", 3_000)
}

fun getTimeNow(): String =
    SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault())
        .format(Date())

suspend fun order(material: BuildingMaterial): BuildingMaterial {
    println("${getTimeNow()} >>>> REQUESTING ${material.description}...")
    delay(material.deliveryTimeInMillis)
    println("${getTimeNow()} >>>> ${material.description} DELIVERED!")
    return material
}

suspend fun doWork(task: String) {
    println("${getTimeNow()} >>>> EXECUTING TASK $task...")
    delay(1_000)
    println("${getTimeNow()} >>>> TASK [$task] DONE!")
}

fun main() {
    runBlocking {
        val window = async { order(BuildingMaterial.WINDOWS) }
        val roof = async { order(BuildingMaterial.ROOF) }
        val doors = async { order(BuildingMaterial.DOORS) }

        doWork("BUILD WALLS")
        launch { doWork("INSTALL ${doors.await().description}") }
        launch { doWork("INSTALL ${roof.await().description}") }
        launch { doWork("INSTALL ${window.await().description}") }
    }
}