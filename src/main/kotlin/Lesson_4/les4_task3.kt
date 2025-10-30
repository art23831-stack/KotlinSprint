package org.example.Lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "winter"

    val favorableConditions: Boolean = sunnyWeather && openAwning && airHumidity == 20 && timeOfYear != "winter"

    println("Blagopriyatnie li seichas yslovia? $favorableConditions")

}