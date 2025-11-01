package characters

import magic.Spell
import world.Quest

class Hero(
    name: String = "Неизвестен",
    var gender: String = "Не указан",
    var role: String = "хз",
    var level: Int = 0,
    element: String = "хз",
    hp: Int = 0,
    var mp: Int = 0,
    val experience: Int = 0

): GameCharacter(name,hp,element) {


    fun sayHello() {
        println("Я — $name, мой путь только начинается!")
    }

    fun showStats() {
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage(amount: Int) {
        println("$name получает урон!")
        hp -= amount
        println("Осталось здоровья: $hp")
    }

    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врвга ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name использовали зелье($spellName) на ${enemy.name}!")
        if (element == enemy.element) {
            println("Стихии совпадают, урон снижен")
            val reduceDamage = damage / 2
            enemy.takeDamage(reduceDamage)
        } else {
            enemy.takeDamage(damage)
        }
        mp -= 10
        if (mp < 0) mp = 0
        println("ОСтаток маны: $mp")
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается")
        println("$name атакует первым")
        opponent.takeDamage(15)
        this.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль закончена")
        println("Сочтояние двух героев")
        this.showStats()
        opponent.showStats()
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "легкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept){
            println("$name может принять квест ${quest.title}")
        }else{
            println("$name не может принять квест ${quest.title}")
        }
        return canAccept
    }

    fun canCast(spell: Spell): Boolean {
        return if (spell.name.length <= level * 2) {
            true
        } else if (spell.width <= 5 && spell.heihgt <= 5) {
            true
        } else {
            false
        }
    }

}