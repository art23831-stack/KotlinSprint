package org.example.Lesson_5

fun main() {

    val userYearOfBirth = readln().toInt()
    val yearIsNow = 2025
    val userAge =yearIsNow - userYearOfBirth
    if (userAge >= AGE_OF_MAJORITY){
        println("Show special content")
    } else if (userAge == 16 || userAge == 17){
        println("Show limited content")
    }
    else {println("Back to main screen")}

}

const val AGE_OF_MAJORITY = 18