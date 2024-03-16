package lesson_13

class Person5(
    val name: String,
    val number: Long?,
    val company: String? = null
) {
    fun print() { println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}") }
}

fun main() {
    val contacts = mutableListOf<Person5>()

    println("Введите номер телефона:")

    val number = try {
        readln().toLong()
    }
    catch (e: Exception) {
        println("Ошибка: ${e.javaClass.simpleName}")
        println("Текст ошибки: ${e.message}")
        null
    }

    println("Введите имя:")
    val name = readln()

    println("Введите компанию:")
    var company: String? = readln()
    if (company == "") company = null

    contacts.add(Person5(name = name, number = number, company = company))
}