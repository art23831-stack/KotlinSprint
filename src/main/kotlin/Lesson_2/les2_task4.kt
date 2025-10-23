package Lesson_2

fun main() {

    val krystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11
    val buff = 1.2

    val bonusCrystalOre = krystalOreWithoutBuff * buff - krystalOreWithoutBuff
    val bonusIronOre = ironOreWithoutBuff * buff - ironOreWithoutBuff

    println(bonusCrystalOre.toInt())
    println(bonusIronOre.toInt())
}