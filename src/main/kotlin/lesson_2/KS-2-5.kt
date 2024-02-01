package lesson_2

import java.util.*
import kotlin.math.pow

fun main() {
    val value: Int = 70_000
    val perc_full: Float = 16.7F
    val perc_decimal: Float = (perc_full / 100)
    val years: Int = 20

    val final: Float = value * (1 + perc_decimal).pow(years)

    println("%.3f".format(Locale.ENGLISH, final))
}