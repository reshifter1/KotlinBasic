package lesson_1_10.lesson_5

val LIMIT_OF_RANDOM2 = 42

fun main() {
    val randomNumber1 = (1..LIMIT_OF_RANDOM2).random()
    val randomNumber2 = (1..LIMIT_OF_RANDOM2).random()
    val randomNumbers = arrayOf(randomNumber1, randomNumber2)

    println("Введите числа:")
    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()

    if ((randomNumber1 == inputNumber1) && (randomNumber2 == inputNumber2) ||
        (randomNumber2 == inputNumber1) && (randomNumber1 == inputNumber2))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (inputNumber1 in randomNumbers || inputNumber2 in randomNumbers)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Числа для победы: $randomNumber1 $randomNumber2")
}