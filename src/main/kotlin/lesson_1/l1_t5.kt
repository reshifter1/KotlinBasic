package lesson_1

fun main() {
    var seconds: Int = 6480
    val SECS_IN_MINUTE: Int = 60
    val MINS_IN_HOUR: Int = 60

    val minutes: Int = seconds / MINS_IN_HOUR % SECS_IN_MINUTE
    val hours: Int = seconds / (MINS_IN_HOUR * SECS_IN_MINUTE)

    seconds = seconds % SECS_IN_MINUTE

    println(minutes)
    println(hours)


    val secondsString = String.format("%02d", seconds)
    val minutesString = String.format("%02d", minutes)
    val hoursString = String.format("%02d", hours)

    println("$hoursString:$minutesString:$secondsString")
}