package lesson_1

fun main() {
    var seconds: Int = 6480

    val minutes: Int = seconds / 60 % 60
    val hours: Int = seconds / (60 * 60)

    seconds = seconds / 60 % 60

    println(minutes)
    println(hours)

    fun intToStingWithNulls(a: Int): String {
        return if (a < 10) "0$a" else "$a"
    }

    val secondsString = intToStingWithNulls(seconds)
    val minutesString = intToStingWithNulls(minutes)
    val hoursString = intToStingWithNulls(hours)

    println("$hoursString:$minutesString:$secondsString")
}