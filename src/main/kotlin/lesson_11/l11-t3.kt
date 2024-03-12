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


class Room (
    var icon: String,
    var name: String,
    val userMap: MutableMap<String, User3>,
) {
    fun addUser(user3: User3) {
        userMap[user3.nickname] = user3
    }

    fun newStatus(username: String, status: String) {
        try {
            userMap[username]!!.status = status
        } catch (e: Exception) { println("Ошибка: ${e.javaClass.simpleName}") }
    }

    fun getUserInfo(username: String) {
        try {
            userMap[username]!!.getInfo()
        } catch (e: Exception) { println("Ошибка: ${e.javaClass.simpleName}") }
    }
}


class User3(
    val nickname: String,
    var avatar: String,
    var status: String,
) {
    fun getInfo() {
        println("$nickname:$avatar:$status")
    }
}