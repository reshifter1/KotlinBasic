package lesson_2

fun main() {
    val trainWentHours: Byte = 9
    val trainWentMins: Byte = 39
    val trainMinsLeft: Int = 457

    val trainArriveMins = (trainWentMins + trainMinsLeft) % 60
    val trainArriveHours = trainMinsLeft / 60 + trainWentHours

    println(trainArriveMins)
    println(trainArriveHours)
}
