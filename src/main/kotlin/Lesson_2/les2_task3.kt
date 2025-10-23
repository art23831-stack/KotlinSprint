package Lesson_2

fun main() {

    val departureHour = 9
    val departureMin = 39
    val minutesOnTheWay = 457

    val departureTimeInMinutes = 9 * 60 + 39
    val arrivalTimeInMinutes = departureTimeInMinutes + 457
    val arrivalHour = (arrivalTimeInMinutes / 60) % 24
    val arrivalMinutes = arrivalTimeInMinutes % 60

    println("$arrivalHour:$arrivalMinutes")

}