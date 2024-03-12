package lesson_1_10.lesson_2

fun main() {
    val crystals: Int = 7
    val iron: Int = 11
    val buff: Int = 20
    val buff_percent: Float = buff.toFloat() / 100

    val crystalsBuffed: Int = (crystals * buff_percent).toInt()
    val ironBuffed: Int = (iron * buff_percent).toInt()

    println(buff_percent)
    println(crystalsBuffed)
    println(ironBuffed)
}