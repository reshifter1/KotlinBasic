package lesson_17

class Quiz {
    val question1 = "Кто победит на выборах в 2024 году?"
        get() = field

    var answer1 = "Владимир Путин"
        get() = field
        set(value) {field = value}
}

fun main() {
    val quiz = Quiz()
    println(quiz.question1)
    println(quiz.answer1)
}
