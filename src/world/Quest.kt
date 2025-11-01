package world

class Quest(
    title: String,
    val duration: Int = 0,
    reward: Int,
    val difficulty: String = "",
    val questType: QuestType
) : Mission(title, reward) {


    override fun describe(){
        println("Квест $title на $duration часов, сложность $difficulty, нагарда$reward золотых")
        println("Тип квеста ${questType.description}")
    }

    fun printInfo() {
        println("Название квеста: $title")
        println("Тип квеста: ${questType.description}")
        println("Время выполнения: $duration ч.")
        println("Награда: $reward золотых")
        println("Уровень сложности: $difficulty")
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int {
        require(duration >= 0 && reward >= 0) { "Длительность и награда не могут быть отрицательными" }
        if (duration == 0) return 0
        return reward / duration
    }

}