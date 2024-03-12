package lesson_11

fun main() {
    val user2 = User2(2, "pavel", "123", "fvjriv@mail.ru")

    user2.setBio()
    user2.setPassword()
    user2.printParametres()
}


class User2(
    val id: Int,
    val username: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printParametres() {
        println("$id:$username:$password:$email")
    }

    fun setPassword() {
        println("Введите текущий пароль:")
        if (readln() == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль обновлён")
        } else println("Неверный пароль")
    }

    fun setBio() {
        println("Введите биографию:")
        bio = readln()
        println("Биография обновлена")
    }
}