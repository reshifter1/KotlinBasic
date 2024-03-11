package lesson_13

fun main() {
    val contacts = mutableListOf<Person5>()

    println("Введите номер телефона:")
    var number: Long = 0

    try {
        number = readln()!!.toLong()
    } catch (e: Exception) {
        println("Ошибка: ${e.javaClass.simpleName}")
        println("Текст ошибки: ${e.message}")
    }

    println("Введите имя:")
    val name = readln()

    println("Введите компанию:")
    var company: String? = readln()
    if (company == "") company = null

    contacts.add(Person5(name = name, number = number, company = company))
}