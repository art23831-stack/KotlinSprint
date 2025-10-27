package org.example.Lesson_2

fun main() {

    val departureHour = 9
    val departureMin = 39
    val minutesOnTheWay = 457
    val minutesInHours = 60
    val hoursInDay = 24

    val departureTimeInMinutes = departureHour * minutesInHours + departureMin
    val arrivalTimeInMinutes = departureTimeInMinutes + minutesOnTheWay
    val arrivalHour = (arrivalTimeInMinutes / minutesInHours) % hoursInDay
    val arrivalMinutes = arrivalTimeInMinutes % minutesInHours

    println("$arrivalHour:$arrivalMinutes")

}