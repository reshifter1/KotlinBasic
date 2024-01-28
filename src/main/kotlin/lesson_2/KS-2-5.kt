package lesson_2

import java.util.*
import kotlin.math.pow

fun main() {
    val value: Int = 70_000
    val perc: Double = 0.167
    val years: Int = 20

    val final: Double = value * (1 + perc).pow(years)

    println("%.3f".format(Locale.ENGLISH, final))
}