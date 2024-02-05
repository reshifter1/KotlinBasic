package lesson_6

fun main() {
    println("Придумайте логин:")
    val username = readln()

    println("Придумайте пароль:")
    val password = readln()

    while (true) {
        println("Введите логин и пароль:")
        if ((username == readln()) && (password == readln())) {
            println("Авторизация прошла успешно")
            return
        } else println("Данные неверны")
    }
}