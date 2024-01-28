package lesson_1

fun main() {
    val flightYear: String = "1961"
    var flightHour: String = "09"
    var flightMinute: String = "07"

    println(flightYear)
    println(flightHour)
    println(flightMinute)
    flightHour = "10"
    flightMinute = "55"
    println("[" + flightHour + ":" + flightMinute + "]")
}