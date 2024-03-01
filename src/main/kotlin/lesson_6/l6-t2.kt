package lesson_6

fun main() {

    println("Введите количество секунд:")
    val seconds = readln().toLong()

    Thread.sleep(/* millis = */ seconds * 1000)     // Альтернативный способ отметки миллисекунд

    println("Прошло $seconds секунд(ы)")
}