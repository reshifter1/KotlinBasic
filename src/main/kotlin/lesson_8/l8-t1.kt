package lesson_8

fun main() {
    val weekArray = intArrayOf(0, 0, 0, 0, 0, 0, 0)

    // Рандомными значениями забить поприкольнее
    for (i in 0..6) weekArray[i] = (1..100).random()

    var sumOfViews = 0
    for (i in 0..6) sumOfViews += weekArray[i]

    println(sumOfViews)
}