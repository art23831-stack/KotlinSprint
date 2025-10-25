package lesson_3

fun main() {

    val name = "Tatyana"
    val surname1 = "Andreeva"
    val patronymic = "Sergeevna"
    val surname2 = "Sidorova"
    val age1 = 20
    val age2 = 22

    val nspAge1 = "$surname1 $name $patronymic:$age1"
    val nspAge2 = "$surname2 $name $patronymic:$age2"

    println(nspAge1)
    println(nspAge2)

}