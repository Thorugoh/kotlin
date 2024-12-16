package classes

// will have only one instance, cannot be instantiated again
// cannot have a constructor
object DatabaseUtil {
    val url: String = "jdbc:mysql://localhost:8080/mydb"
    private val user: String = "admin"
    private val password: String = "admin"

    fun connect(){
        println("Connection to database $url | User: $user | Password: $password")
    }
}

// kotlin 2.0 introduces data objects with same differences between classes and data classes
data object DatabaseHelper {

}

fun main(){
    DatabaseUtil.connect()

    println(DatabaseUtil)
    println(DatabaseHelper)
}