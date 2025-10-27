package org.example.Lesson_5

fun main() {

    val sum = 17
    println("Need verification: How much 9 + 8?")

    val answer = readln().toInt()
    if (answer == sum) {
        println("Welcome!")
    }
    else { println("access denied") }

}