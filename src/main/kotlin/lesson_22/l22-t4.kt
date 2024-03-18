package lesson_22

data class MainScreenState(val data: String?, val isLoading: Boolean = false)

class MainScreenViewModel {
    var mainScreenState = MainScreenState(null)

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)

        println(mainScreenState)

        mainScreenState = mainScreenState.copy(data = "дата дата моя дата", isLoading = false)
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    println(viewModel.mainScreenState)

    viewModel.loadData()
    println(viewModel.mainScreenState)
}
