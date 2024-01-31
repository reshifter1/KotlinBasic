package lesson_3

fun main() {
    var age: Byte = 20

    var surname: String = "Андреева"
    val name: String = "Татьяна"
    val patronymic: String = "Сергеевна"

    println("[$surname $name $patronymic, $age]")

    age = 22
    surname = "Сидорова"

    println("[$surname $name $patronymic, $age]")
}