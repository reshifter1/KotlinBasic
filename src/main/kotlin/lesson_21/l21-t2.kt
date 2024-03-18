package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var totalSum = 0
    this.forEach() {if (it % 2 == 0) totalSum += it}
    return totalSum
}

fun main() {
    println(listOf(5, 6, 7, 8, 9).evenNumbersSum())
}