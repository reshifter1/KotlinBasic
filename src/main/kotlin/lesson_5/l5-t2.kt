package lesson_5

import java.util.*

const val ageOfConsent = 18

fun main() {
    val calendar = Calendar.getInstance()
    val thisYear = calendar.get(Calendar.YEAR)

    println("Введите дату рождения:")
    val userBirthYear = readln().toInt()

    if ((thisYear - userBirthYear) >= ageOfConsent) println("Показать экран со скрытым контентом")
    else println("Обнови страницу и попробуй ввести год поменьше")
}