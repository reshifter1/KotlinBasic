package lesson_11

class Room (
    var icon: String,
    var name: String,
    val userMap: MutableMap<String, User3>,
) {
    fun addUser(user3: User3) {
        userMap[user3.nickname] = user3
    }

    fun newStatus(username: String, status: String) {
        userMap[username]!!.status = status
    }

    fun getUserInfo(username: String) {
        userMap[username]!!.getInfo()
    }
}