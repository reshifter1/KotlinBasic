package lesson_1_10.lesson_3

fun main() {
    var from: String = "E2"
    var to: String = "E4"
    var turn: Int = 1

    var resuls:String = "[$from-$to;$turn]"

    println(resuls)

    from = "D2"
    to = "D3"
    turn = 2

    resuls = "[$from-$to;$turn]"

    println(resuls)
}