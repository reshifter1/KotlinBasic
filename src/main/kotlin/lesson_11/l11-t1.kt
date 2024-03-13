package lesson_11

fun main() {

    val user1 = User (2, "pavel", "123", "fvjriv@mail.ru")
    val user2 = User (3, "not_pavel", "1432423", "fvjr2giv@mail.ru")

    user1.printParametres()
    user2.printParametres()

}


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