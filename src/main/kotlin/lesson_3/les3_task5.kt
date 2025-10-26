package org.example.lesson_3

fun main() {

    val string = "D2-D4;0"
    val partString = string.split(";")
    val partMove = partString[0]
    val partNumberMove = partString[1]

    val position = partMove.split("-")
    val from = position[0]
    val to = position[1]

    println(from)
    println(to)
    println(partNumberMove)

    }

