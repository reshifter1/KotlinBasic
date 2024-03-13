package lesson_15

interface Flying {
    fun fly() {
        println("Я лечу!")
    }
}

interface Walking {
    fun walk() {
        println("Я хожу!")
    }
}

interface Swimming {
    fun swim() {
        println("Я плыву!")
    }
}

class Carp() : Swimming

class Seagull() : Flying, Walking

class Duck() : Flying, Walking, Swimming

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    seagull.walk()
    duck.fly()
    duck.walk()
    duck.swim()
}