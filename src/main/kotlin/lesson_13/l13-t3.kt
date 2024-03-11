package lesson_13

fun main() {
    val contacts = mutableListOf<Person3>(
        Person3("Ростислав", 89123456789, "Reddit"),
        Person3("Маша", 859465869545, null),
        Person3("Саша", 64566456456, null),
        Person3("Петя", 964895465496, "null"),
        Person3("Галина", 5943543958743, "Вкусно и точка")
    )

    val companies = mutableSetOf<String?>()

    for (person in contacts) companies.add(person.company)

    for (company in companies) println(company)
}