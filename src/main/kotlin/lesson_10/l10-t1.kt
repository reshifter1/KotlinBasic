package lesson_10

val throwDice: () -> Int = {(1..6).random()}
fun main() {
    val personThrow = throwDice()
    println("Человек выбросил $personThrow")

    val robotThrow = throwDice()
    println("Компьютер выбросил $robotThrow")

    when {
        personThrow > robotThrow -> println("Победило человечество")
        personThrow < robotThrow -> println("Победила машина")
        else -> println("Ничья!")
    }
}