package lesson_13

class Person4(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun print() { println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}") }
}