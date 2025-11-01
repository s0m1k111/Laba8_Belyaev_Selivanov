package pets

class Bear(name: String, val muscule: Int=0) : Pet(name = name, speed = 50, maxHealth = 550) {
    override fun makeSound() {
        println("$name рычит")
    }
    override fun describe() {
        println("$name,$maxHealth,$speed")
        println("$name — сильный и выносливый медведь, сила - $muscule")
    }
}