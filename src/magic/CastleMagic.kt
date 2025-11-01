package magic

import magic.Spell

fun main(){
//    val fireWall = Spell("огненная стена", 5,10,"\uD83D\uDD25")
//    fireWall.cast()
//    val iceShield = Spell("Ice Shield",5,"\u2744\uFE0D")
//    iceShield.cast()
//    val spell = Spell()
//    spell.cast()
//    println(fireWall.area())
//    println(iceShield.area())
//    println(spell.area())

    val fireball = Spell("Огненный шар",3,3, "\uD83D\uDD25")
    val heal = InstantSpell("Лечение","\uD83D\uDC9A",5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}