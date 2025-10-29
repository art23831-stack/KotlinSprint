package Lesson_2

fun main() {

    val krystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11
    val percentBuff = 20
    val buff: Float = percentBuff / 100f

    val bonusCrystalOre =krystalOreWithoutBuff + krystalOreWithoutBuff * buff
    val bonusIronOre = ironOreWithoutBuff + ironOreWithoutBuff * buff

    println(bonusCrystalOre.toInt())
    println(bonusIronOre.toInt())
}