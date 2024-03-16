package lesson_13

class Person4(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun print() {
        println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = mutableListOf<Person4>()

    var oneMorePhone = "да"
    while (oneMorePhone.equals("да", ignoreCase = true)) {
        println("Введите номер телефона:")
        val number = readln().toLongOrNull()

        if (number == null) {
            println("Номер пуст или присутствуют символы!")
            continue
        }

        println("Введите имя:")
        val name = readln()

        println("Введите компанию:")
        var company: String? = readln()
        if (company == "") company = null

        contacts.add(Person4(name = name, number = number, company = company))

        println("Добавить ещё? контакт в телефонную книгу?")
        oneMorePhone = readln()
    }

    for (person in contacts) person.print()

}