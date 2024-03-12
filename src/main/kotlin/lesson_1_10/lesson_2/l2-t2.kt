package lesson_1_10.lesson_2

fun main() {
    val traineeCnt: Int = 30
    val traineeSalary: Int = 20000
    val employeeCnt: Int = 50
    val employeeSalary: Int = 30000

    val employeeCosts: Int = employeeCnt * employeeSalary
    val totalCosts: Int = employeeCosts + (traineeSalary * traineeCnt)
    val avgSalary: Int = totalCosts / (traineeCnt + employeeCnt)

    println(employeeCosts)
    println(totalCosts)
    println(avgSalary)
}