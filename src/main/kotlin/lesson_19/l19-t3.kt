package lesson_19

class Spaceship {
    fun takeOff() {
        TODO("Нужна доп. инфа")
    }

    fun land() {
        throw NotImplementedError("Метод 'land' не реализован")
    }

    fun shootAsteroid() {
        // TODO устроить пенную вечеринку
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.takeOff()
}