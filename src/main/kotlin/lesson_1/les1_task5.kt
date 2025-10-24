package lesson_1

import javax.swing.JFormattedTextField

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    val formatedTimeInSpace = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(formatedTimeInSpace)
}