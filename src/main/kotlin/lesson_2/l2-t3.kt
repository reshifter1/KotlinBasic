package lesson_2

const val MINS_IN_HOUR = 60

fun main() {
    val trainWentHours: Byte = 9
    val trainWentMins: Byte = 39
    val trainMinsLeft: Int = 457

    val trainArriveMins = (trainWentMins + trainMinsLeft) % MINS_IN_HOUR
    val trainArriveHours = (trainWentMins + trainMinsLeft) / MINS_IN_HOUR + trainWentHours

    println("$trainArriveHours:$trainArriveMins")
}
