package lesson_1_10.lesson_6

fun main() {

    println("Введите количество секунд:")
    var seconds = readln().toLong()

    while (seconds > 0) {
            println("Осталось секунд: ${seconds--}")
            Thread.sleep(/* millis = */ 1000)
    }

    println("Время вышло!")
}