package org.example.Lesson_5

fun main() {

    println("Enter a number from 0 to 42")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val winNumber1 = 7
    val winNumber2 = 34

    if ((number1 == winNumber1 || number1 == winNumber2)
        && (number2 == winNumber1 || number2 == winNumber2)){
        println("You win")

    } else if ((number1 == winNumber1 || number1 == winNumber2)
        || (number2 == winNumber1 || number2 == winNumber2)){
        println("Consolation prize")

    } else if ((number1 != winNumber1 || number1 != winNumber2)
        && (number2 != winNumber1 || number2 != winNumber2)){
        println("You lost")}

    println("Number for win: $winNumber1; $winNumber2")
}