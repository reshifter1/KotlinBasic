package lesson_4

const val minWeight = 35
const val maxWeight = 100
const val maxVolume = 100

fun main() {
    val firstWeight = 20
    val firstVolume = 80

    val secondWeight = 50
    val secondVolume = 100

    println((firstVolume < maxVolume) && (firstWeight >= minWeight) && (firstWeight <= maxWeight))
    println((secondVolume < maxVolume) && (secondWeight >= minWeight) && (secondWeight <= maxWeight))
}