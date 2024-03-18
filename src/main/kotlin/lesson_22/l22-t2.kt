package lesson_22

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook2("Title", "Author")

    val dataBook1 = DataBook2("Title", "Author")

    println(regularBook1) // Выведет имя класса и хэшкод

    println(dataBook1)    // Выведет в читаемом виде
}