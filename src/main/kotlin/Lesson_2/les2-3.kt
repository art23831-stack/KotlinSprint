package org.example.Lesson_2

fun main() {

    val departureHour = 9
    val departureMin = 39
    val minutesOnTheWay = 457

    val departureTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMin
    val arrivalTimeInMinutes = departureTimeInMinutes + minutesOnTheWay
    val arrivalHour = (arrivalTimeInMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinutes = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("$arrivalHour:$arrivalMinutes")
}

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24