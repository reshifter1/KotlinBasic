package lesson_10

private fun throwDice(): Int {return (1..6).random()}

fun doRound(personThrow: Int, robotThrow: Int): Int {
    when {
        personThrow > robotThrow -> {
            println("Победило человечество")
            return 1
        }
        personThrow < robotThrow -> println("Победила машина")
        else -> println("Ничья!")
    }
    return  0
}


fun main() {
    var result = 0

    do {
        val personThrow = throwDice()
        println("Человек выбросил $personThrow")

        val robotThrow = throwDice()
        println("Компьютер выбросил $robotThrow")

        result += doRound(personThrow = personThrow, robotThrow = robotThrow)
        println("Хотите сыграть ещё? Напишите \"Да\", если хотите.")
    }
    while (readln().equals("да", ignoreCase = true))
    println("Количество побед: $result")
}