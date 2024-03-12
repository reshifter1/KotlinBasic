package lesson_1_10.lesson_2

fun main() {
    val value1 = 3
    val value2 = 4
    val value3 = 3
    val value4 = 5
    val valuesCount = 4
    val avgRating: Float = ((value1 + value2 + value3 + value4).toFloat() / valuesCount)

    println(avgRating)
}