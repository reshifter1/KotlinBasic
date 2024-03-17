package lesson_18

open class Animal(val name: String) {
    open fun eat() {
        println("$name - ест")
    }

    open fun play() {
        println("$name - играет")
    }

    open fun sleep() {
        println("$name - спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест рыбу")
    }
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    fox.eat()
    dog.play()
    cat.sleep()
}
