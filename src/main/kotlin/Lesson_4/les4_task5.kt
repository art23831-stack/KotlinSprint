package org.example.Lesson_4

fun main() {

        val damage: Boolean = false
        val crew: Int = 60
        val provision: Int = 55
        val weatherGood: Boolean = true
        val weatherBad: Boolean = true

        val itIsPossibleToSend: Boolean =
            (!damage && crew >= 55 && crew <= 70
                    && provision > 50 && weatherGood || weatherBad)
        (crew == 70 && weatherGood && provision > 50)

        println(itIsPossibleToSend)

    }

