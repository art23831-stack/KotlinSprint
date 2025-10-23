package Lesson_2

import kotlin.math.pow

fun main() {

    val sum = 70000
    val interestRate = 0.167
    val years = 20

    val totalAmount = sum * (1 + interestRate).pow(years)
    val formattedTotalAmount = "%.3f".format(totalAmount)
    println(formattedTotalAmount)
}