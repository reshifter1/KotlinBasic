package lesson_20

class Player(var hasKey: Boolean)

val checkDoor: (Player) -> Unit = { player ->
    if (player.hasKey) {
        println("Игрок открыл дверь.")
    } else {
        println("Дверь заперта.")
    }
}

fun main() {
    val player1 = Player(hasKey = true)
    val player2 = Player(hasKey = false)

    checkDoor(player1)
    checkDoor(player2)
}
