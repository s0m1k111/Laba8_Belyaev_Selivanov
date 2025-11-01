package pets

class Eagle(name: String) : Pet(name = name, speed = 250, maxHealth = 50) {
    override fun makeSound() {
        println("$name кричит")
    }
    override fun describe() {
        println("$name,$maxHealth,$speed")
        println("$name — гордый и зоркий орёл")
    }
}