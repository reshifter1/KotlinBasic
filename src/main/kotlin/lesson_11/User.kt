package lesson_11

class User (
    val id: Int,
    val username: String,
    val password: String,
    val email: String
){
    fun printParametres() {
        println("$id:$username:$password:$email")
    }
}