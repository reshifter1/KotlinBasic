package lesson_17

class Quiz (_question1: String, _answer1: String) {
    val question1 = _question1
        get() = field

    var answer1 = _answer1
        get() = field
        set(value) {field = value}
}

fun main() {
    val quiz = Quiz("Кто победит на выборах в 2024 году?", "Владимир Путин")
    println(quiz.question1)
    println(quiz.answer1)
}
