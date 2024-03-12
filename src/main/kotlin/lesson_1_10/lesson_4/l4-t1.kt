package lesson_1_10.lesson_4

private const val TOTAL_TABLES: Byte = 13

fun main() {
    val tomorrowTablesLeft: Byte = 9
    val todayTablesLeft: Byte = 13

    val todayNote: String = "Доступность столиков на сегодня:"
    val tomorrowNote: String = "Доступность столиков на завтра:"

    println("[$todayNote ${TOTAL_TABLES - todayTablesLeft > 0}],\n[$tomorrowNote ${TOTAL_TABLES - tomorrowTablesLeft > 0}].")
}