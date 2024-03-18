package lesson_22

data class DataBook2(val title: String, val author: String, val year: Int)

fun main() {
    val book = DataBook2("Сборник стихов", "А.С.Пушкин", 2007)

    val (title, author, year) = book

    println("Title: $title")
    println("Author: $author")
    println("Year: $year")
}
