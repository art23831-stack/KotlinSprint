package lesson_1

fun main() {

    val year = 1961
    var hour = 9
    var minutes = 7

    println("$year year")
    println("$hour h")
    println("$minutes min")
    println()

    hour = 10
    minutes = 55
    val announcement = ("$hour:$minutes - vremya posadki")

    println(announcement)

}