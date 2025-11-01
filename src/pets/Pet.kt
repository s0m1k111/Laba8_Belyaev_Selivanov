package pets

open class Pet(val speed: Int = 0, val name: String = "", val maxHealth: Int = 0){
    open fun describe(){
        println("$name,$maxHealth,$speed")
    }

    open fun makeSound(){
        println("$name подает голос")
    }
}