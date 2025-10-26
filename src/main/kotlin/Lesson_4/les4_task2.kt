package org.example.Lesson_4

fun main() {

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории \"Average\":${weight1 > 35 && weight1 <= 100 && volume1 < 100}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории \"Average\":${weight2 > 35 && weight2 <= 100 && volume2 < 100}")

}