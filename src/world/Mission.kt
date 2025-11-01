package world

open class Mission(val title: String,val reward:Int=0){
    open fun describe(){
        println("Миссия: $title, награда: $reward монет")
    }
    fun isHighReward(): Boolean{
        return reward > 1000
    }
}