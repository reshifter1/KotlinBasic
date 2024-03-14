package lesson_5

fun main() {
    val welcomeText = "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту кор" +
            "абля \"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли п" +
            "риступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное" +
            ", об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
    val usernameRequest = "Введите имя пользователя..."
    val zaphodUsername = "Zaphod"
    val zaphodPassword = "PanGalactic"

    val noUserText = "[вздыхает...] Вы не зарегистрированы... Какая жалость... Можете зарегистрироваться... " +
            "А можете не регистрироваться... Мне всё равно..."
    val userExist = "Введите пароль, пока вы его помните... Или пока я его помню... Я не хочу его помнить..."
    val falsePassword = "Неверный пароль... Или я его забыл? А, впрочем..."
    val zaphodEntered = "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам" +
            " разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если" +
            " вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здес" +
            "ь больше, чем мне."

    println(welcomeText)
    println(usernameRequest)

    if (readln() != zaphodUsername) {
        println(noUserText)
        return
    } else println(userExist)

    if (readln() != zaphodPassword) {
        println(falsePassword)
    } else println(zaphodEntered)

}