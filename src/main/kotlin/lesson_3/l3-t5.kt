package lesson_3

/*
fun solution1() {
    val input = "[E2-E4;1]"

    val regex = Regex("\\[([A-Z]\\d+)-([A-Z]\\d+);(\\d+)]")

    val matchResult = regex.find(input)

    if (matchResult != null) {
        val (from, to, turn) = matchResult.destructured
        println(from)
        println(to)
        println(turn)
    }
}
*/

fun main () {
    val input = "[E2-E4;1]"

    val splitted = input.split("[", "-", ";", "]")

//    Не знаю, как сделать элегантнее
    val (_, from, to, turn, _) = splitted

    println(from)
    println(to)
    println(turn)
}
