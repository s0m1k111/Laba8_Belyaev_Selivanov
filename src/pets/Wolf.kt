package pets

class Wolf(name: String, val size: Int=0): Pet(name = name, speed = 100, maxHealth = 250) {
    override fun makeSound() {
        println("$name воет")
    }
    override fun describe(){
        println("$name,$maxHealth,$speed")
        println("Размер стаи $size")
    }
}