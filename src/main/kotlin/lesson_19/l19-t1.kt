package lesson_19

enum class Fish {
    GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Вы можете добавить данных рыб:")
    Fish.entries.forEach { println(it) }
}