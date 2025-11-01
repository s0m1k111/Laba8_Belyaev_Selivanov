package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isConvert: Boolean
): Mission(title,reward) {
    fun showReward(){
        println("Требуемый допуск: $requiredClearance")
        println("${if (isConvert)"Совершенно секретно" else "Обычный"}")
    }

    override fun describe(){
        println("Спеуоперация $title Уровень допуска $requiredClearance, Режим ${if (isConvert) "Секретно" else "Открыто"} награда $reward")
    }
}