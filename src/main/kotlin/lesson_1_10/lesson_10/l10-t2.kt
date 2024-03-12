package lesson_1_10.lesson_10

fun validateLength(data: String): Boolean {
    if (data.count() < 4) return false
    else return true
}

fun main() {
    println("Введите логин:")
    val username = readln()
    println("Введите пароль:")
    val password = readln()

    if (validateLength(username) && validateLength(password)) println("Привет!")
    else println("Логин или пароль недостаточно длинные")
}