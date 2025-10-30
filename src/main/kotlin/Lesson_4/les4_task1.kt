package org.example.Lesson_4

fun main() {

    val bookedOfToday = 13
    val bookedForTomorrow = 9
    val reservationOfTables1: Boolean = bookedOfToday < NUMBER_OF_TABLES
    val reservationOfTables2: Boolean = bookedForTomorrow < NUMBER_OF_TABLES

    println("Dostypnost' stolikov na segodnya: $reservationOfTables1\n" +
            "Dostypnost' stolikov na zavtra: $reservationOfTables2")

}

const val NUMBER_OF_TABLES = 13