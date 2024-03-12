package lesson_1_10.lesson_7

fun main() {
    println("Введите количество секунд:")

    for (i in readln().toInt() downTo 1) {
        println("Осталось $i секунд(ы)")
        Thread.sleep(/* millis */ 1000)
    }

    println("Время вышло!")
}