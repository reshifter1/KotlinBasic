package lesson_11

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