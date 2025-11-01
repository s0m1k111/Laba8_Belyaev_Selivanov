package characters

fun main() {


    val enemy: GameCharacter = Enemy("Джин")
    val hero: GameCharacter = Hero("Наруто")
    val npc: GameCharacter = NPC("Торговец")
    println(enemy.name)
    (enemy as? Enemy)?.takeDamage(20)


    (enemy as Enemy).takeDamage(amount = 20)
    enemy.takeDamage(amount = 20)
    println(enemy.name)




    val blacksmith = NPC("Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()


    val dragon = Boss(
        "Алдуин", hp = 500, "Огонь", phaseCount = 4,
        isFinalBoss = true
    )
    dragon.startPhase(2)
    println(dragon.dropLoot())
    dragon.takeDamage(150)


//    val quest1 = world.Quest("Охота на дракона", duration = 10, reward = 1000,"Сложный")
//    println(quest1.goldPerHour())


//    val zombie = characters.Enemy("Зомби", -100)
//    println(zombie.getThreatLevel())


//    val enemy1 = characters.Enemy("Гоблин",30)
//    println(enemy1.getThreatLevel())


//    val hero = characters.Hero("Artur",level=4 )
//    val easyQuest = world.Quest("Сбор трав", 2,100,"легкий")
//    val hardQuest = world.Quest("Охота на дракона", duration = 10, reward = 1000,"Сложный")
//    hero.canAcceptQuest(easyQuest)
//
//    hero.canAcceptQuest(hardQuest)


//    val hero1 = characters.Hero("Artur",hp=100)
//    println("Жив? ${hero1.isAlive()}")
//    val hero2 = characters.Hero("Artur",hp=0)
//    println("Жив? ${hero2.isAlive()}")
//    val naruto: characters.Hero = characters.Hero()
//    naruto.name = "Наруто Узумаки"
//    naruto.gender = "Мужской"
//    naruto.role = "Хокаге"
//    naruto.hp = 200
//    naruto.mp = 150
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
//
//    val sasuke = characters.Hero()
//    sasuke.name = "Саске Учиха"
//    sasuke.gender = "Мужской"
//    sasuke.role = "Шиноби-отступник"
//    sasuke.hp = 120
//    sasuke.mp = 180
//
//    println("Имя: ${sasuke.name}\nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
//
//    val Godgo=characters.Hero()
//    Godgo.name = "Годжо Сатору"
//    Godgo.gender = "Мужской"
//    Godgo.role = "Маг Проклятий"
//    Godgo.hp = 160
//    Godgo.mp = 300
//    println("Имя: ${Godgo.name}\nПол: ${Godgo.gender} \nКласс: ${Godgo.role}\nЗдоровье: ${Godgo.hp}\nМана: ${Godgo.mp}")
//
//    val hero = characters.Hero()
//    print("Введите имя героя: ")
//    hero.name = readln()
//    print("Введите пол героя: ")
//    hero.gender = readln()
//    print("Введите класс героя: ")
//    hero.role = readln()
//    print("Введите здоровье героя: ")
//    hero.hp = readln().toInt()
//    print("Введите ману героя: ")
//    hero.mp = readln().toInt()
//
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}")
//
//    hero.sayHello()
//    hero.showStats()
//    hero.meditate()
//    hero.takeDamage(10)
//
//    val hero1 = characters.Hero()
//    hero1.greet(name = hero1.name)
//    hero1.greet(name = "Наруто")
//    hero1.takeDamage(10)
//
//

}