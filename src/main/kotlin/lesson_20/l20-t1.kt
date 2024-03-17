package lesson_20

val greeting: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }

fun main() {
    val username = "John"
    val greeting = greeting(username)
    println(greeting)
}