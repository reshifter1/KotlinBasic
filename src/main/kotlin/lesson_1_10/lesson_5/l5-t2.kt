package lesson_1_10.lesson_5

import java.util.*

private const val AGE_OF_CONSENT = 18

fun main() {
    val calendar = Calendar.getInstance()
    val thisYear = calendar.get(Calendar.YEAR)

    println("Введите дату рождения:")
    val userBirthYear = readln().toInt()

    if ((thisYear - userBirthYear) >= AGE_OF_CONSENT) println("Показать экран со скрытым контентом")
    else println("Обнови страницу и попробуй ввести год поменьше")
}