package lesson_17

class Package(val id: Int, _place: String) {
    private var movesCounter = 0
    var place = _place
        set(value) {
            movesCounter += 1
            field = value
        }

    fun printStatus() {
        println("Место: $place, количествл перемещений: $movesCounter")
    }
}

fun main() {
    val package1 = Package(1, "Склад отправителя")
    package1.printStatus()

    package1.place = "Сортировочный центр"
    package1.place = "У курьера"
    package1.printStatus()
}