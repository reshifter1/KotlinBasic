package lesson_11

class User3(
    val nickname: String,
    var avatar: String,
    var status: String,
) {
    fun getInfo() {
        println("$nickname:$avatar:$status")
    }
}