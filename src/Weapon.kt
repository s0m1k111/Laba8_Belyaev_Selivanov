class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo() {
        println("${this.name}, ${this.type}, ${this.damage}, ${this.durability}")
    }

    fun use() {
        this.durability -= 10
        if (this.durability <= 0) println(
            "\"Оружие\n" +
                    "сломано!\"\n"
        )
    }

    fun upgrade(bonus: Int){
        this.damage *= damage
    }
}