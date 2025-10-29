package Lesson_2

import kotlin.math.pow

fun main() {

    val sum = 70000
    val interestRate = 16.7
    val interestRatePrecentFormat = interestRate / 100
    val years = 20

    val totalAmount = sum * (1 + interestRatePrecentFormat).pow(years)
    val formattedTotalAmount = "%.3f".format(totalAmount)
    println(formattedTotalAmount)
}