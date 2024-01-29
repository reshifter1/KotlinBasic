package lesson_4

fun main() {
    val tomorrowTablesLeft: Byte = 9
    val todayTablesLeft: Byte = 13
    val totalTables: Byte = 13
    val todayNote: String = "Доступность столиков на сегодня:"
    val tomorrowNote: String = "Доступность столиков на завтра:"

    println("[$todayNote ${totalTables - todayTablesLeft > 0}],\n[$tomorrowNote ${totalTables - tomorrowTablesLeft > 0}].")
}