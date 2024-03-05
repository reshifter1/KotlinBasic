package lesson_11


fun main() {
    val room = Room(
        "icon.png",
        "room_1",
        mutableMapOf()
    )

    room.addUser(User3("Pavel", "fancy.png", "разговаривает"))
    room.newStatus("Pavel", "пользователь заглушен")
    room.getUserInfo("Pavel")
}