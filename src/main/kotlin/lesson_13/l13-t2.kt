package lesson_13

class Person2(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun print() { println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}") }
}

fun main() {
    val person2 = Person2("Ростислав", 89123456789, "Reddit")

    person2.print()
}
