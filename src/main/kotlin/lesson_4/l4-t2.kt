package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val firstWeight = 20
    val firstVolume = 80

    val secondWeight = 50
    val secondVolume = 100

    println((firstVolume < maxVolume) && (firstWeight >= minWeight) && (firstWeight <= maxWeight))
    println((secondVolume < maxVolume) && (secondWeight >= minWeight) && (secondWeight <= maxWeight))
}