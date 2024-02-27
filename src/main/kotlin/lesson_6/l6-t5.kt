package lesson_6

import kotlin.random.Random



fun main() {
    var attemptsNum = 3

    // Хочу простой, но интересный пример
    // Так у нас получатся большие числа, но которые приятно складывать между собой
    val randomLowDigit: () -> Int = {Random.nextInt(0, 6)}
    val randomLowNumber = {randomLowDigit() * 10000 + randomLowDigit() * 1000 +
            randomLowDigit() * 100 + randomLowDigit() * 10 + randomLowDigit()}

    fun solveProblem(): Boolean {
        val a = randomLowNumber()
        val b = randomLowNumber()

        println("$a + $b =")

        if (readln().toInt() == (a + b)) return true
        else return false
    }


    println("Докажите, что вы не бот. Решите простой пример!")

    while (attemptsNum > 0) {
        if (!solveProblem()) println("Ошибка! Осталось ${--attemptsNum} попыток(ки)!")
        else {
            println("Добро пожаловать!")
            return
        }
    }

    println("Доступ запрещён")

}