package characters

import world.Quest

class NPC(
    name: String,
    hp: Int = 100,
    element: String = "Нейтральный",
    val faction: String = "Городские жители",
    val hasQuest: Boolean = false
): GameCharacter(name,hp,element) {
    fun giveQuest(): String{
        return if (hasQuest){
            "$name предлагает вам квест"
        }else{
            "$name не имеет заданий для вас"
        }
    }

    fun trade(){
        println("$name отрыл торговлю")
    }
}