package lesson_1

fun main() {

    val totalSeconds = 6480
    val secondInMinute = 60
    val secondInHours = 60 * 60
    val hours = totalSeconds / secondInHours
    val remainingSecondsAfterHours = totalSeconds % secondInHours
    val minutes = remainingSecondsAfterHours / secondInMinute
    val seconds = remainingSecondsAfterHours % secondInMinute

    val formatedTimeInSpace = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(formatedTimeInSpace)

}