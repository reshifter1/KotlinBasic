package lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("Title", "Author")
    val regularBook2 = RegularBook("Title", "Author")

    val dataBook1 = DataBook("Title", "Author")
    val dataBook2 = DataBook("Title", "Author")

    println(regularBook1 == regularBook2)

    println(dataBook1 == dataBook2)
}