package lesson_2

fun main() {
    val crystals: Int = 7
    val iron: Int = 11
    val buff: Float = 0.2F

    val crystalsBuffed: Int = (crystals * buff).toInt()
    val ironBuffed: Int = (iron * buff).toInt()

    println(crystalsBuffed)
    println(ironBuffed)
}