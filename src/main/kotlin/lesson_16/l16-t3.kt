package lesson_16

class User(
    val name: String,
    private val password: String
) {
    fun checkPassword(passwordToCheck: String) {
        if (passwordToCheck == password) println("Пароль верный")
        else println("Неверный пароль!")
    }
}

fun main() {
    val user = User("Pavel", "12345")

    user.checkPassword("123")
}