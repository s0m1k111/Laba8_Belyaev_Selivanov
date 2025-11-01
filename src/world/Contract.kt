package world

class Contract(
    title: String,
    val clientname: String = "",
    val taskDescription: String = "",
    reward: Int = 0,
    val isUrgent: Boolean = false,
) : Mission(title, reward) {


    fun printContractInfo(){
        println("Заказчик: $clientname")
        println("зАДАЧА: $taskDescription")
        println("Награда: $reward")
        println("Срочность: ${if (isUrgent) "Cрочно" else "Обычный контракт"}")
    }


    fun getreward(): Int{
        return 500
    }
    fun getDifficulty(): String = "Легкий"

    override fun describe() {
        println("Контракт от $clientname: $taskDescription (${if (isUrgent)"Срочно" else "Обычный"}) награда: $reward )")
    }
}