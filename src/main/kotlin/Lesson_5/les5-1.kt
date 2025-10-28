package org.example.Lesson_5

fun main() {

    val number1 = 9
    val number2 = 8
    val sum = number1 + number2
    println("Need verification: How much $number1 + $number2?")

    val answer = readln().toInt()
    if (answer == sum) {
        println("Welcome!")
    }
    else { println("access denied") }

}