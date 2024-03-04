package lesson_10

val throwDice: () -> Int = {(1..6).random()}

fun doRound(): Int {
    val personThrow = throwDice()
    println("Человек выбросил $personThrow")

    val robotThrow = throwDice()
    println("Компьютер выбросил $robotThrow")

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
        result += doRound()
        println("Хотите сыграть ещё? Напишите \"Да\", если хотите.")
    }
    while (readln() in arrayOf("Да", "да"))
    println("Количество побед: $result")
}