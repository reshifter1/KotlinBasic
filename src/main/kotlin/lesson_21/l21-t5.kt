package lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val map = mapOf(
        Pair("Сила", 5),
        Pair("Ловкость", 6),
        Pair("Интеллект", 6)
    )

    println(map.maxCategory())
}