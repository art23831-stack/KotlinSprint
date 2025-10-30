package org.example.Lesson_4

fun main() {

    val trainingDay = 5
    val dayArms: Boolean = trainingDay % 2 != 0
    val dayPress: Boolean = dayArms
    val dayLegs: Boolean = ! dayArms
    val dayBack: Boolean = dayLegs

    println(
            "Exercices for arms:$dayArms\n" +
            "Exercices for legs:$dayLegs\n" +
            "Exercices for back:$dayBack\n" +
            "Exercices for press:$dayPress\n")

}