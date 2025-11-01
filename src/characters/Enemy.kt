package characters

open class Enemy(
    name: String,
    hp: Int = 0,
    element: String = ""
): GameCharacter(name,hp,element) {


    fun takeDamage(amount: Int) {
        println("$name получает  $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")

    }

    fun isStrong(): Boolean {
        return hp > 100
    }

    fun getThreatLevel(): String{
        if (hp < 0){
            return "Некоректное здоровье"
        }
        return when{
            hp<=50->"Низкий"
            hp >= 150-> "Средний"
            else -> "Высокий"
        }
    }

    fun calculatePower(aggressionLevel: Int = 2): Int{
        return hp*aggressionLevel
    }


}