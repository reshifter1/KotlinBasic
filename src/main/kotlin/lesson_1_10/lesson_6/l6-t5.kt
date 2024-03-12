package lesson_1_10.lesson_6

fun main() {
    var attemptsNum = 3

    val randomLowDigit: () -> Int = {(0..5).random()}
    val randomLowNumber = {randomLowDigit() * 10000 + randomLowDigit() * 1000 +
            randomLowDigit() * 100 + randomLowDigit() * 10 + randomLowDigit()}

    fun solveProblem(): Boolean {
        val variable1 = randomLowNumber()
        val variable2 = randomLowNumber()

        println("$variable1 + $variable2 =")

        if (readln().toInt() == (variable1 + variable2)) return true
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