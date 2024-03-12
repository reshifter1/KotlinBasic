package lesson_1_10.lesson_4

private const val MIN_WEIGHT = 35
private const val MAX_WEIGHT = 100
private const val MAX_VOLUME = 100

fun main() {
    val firstWeight = 20
    val firstVolume = 80

    val secondWeight = 50
    val secondVolume = 100

    println((firstVolume < MAX_VOLUME) && (firstWeight >= MIN_WEIGHT) && (firstWeight <= MAX_WEIGHT))
    println((secondVolume < MAX_VOLUME) && (secondWeight >= MIN_WEIGHT) && (secondWeight <= MAX_WEIGHT))
}