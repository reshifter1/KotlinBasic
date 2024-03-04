package lesson_7

fun main() {
    println("Введите число, до которого будет идти прогрессия:")
    val progressionEnd = readln().toInt()
    for (i in 0..progressionEnd step 2) println(i)
}