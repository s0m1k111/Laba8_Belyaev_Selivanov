package pets

class Cat(name: String, val hide:Int=0) : Pet(name = name, speed = 80, maxHealth = 150) {
    override fun makeSound() {
        println("$name мяукает.")
    }
    override fun describe() {
        println("$name,$maxHealth,$speed")
        println("Наш $name очень скрытный - $hide")
    }
}