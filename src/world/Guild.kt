package world

import world.Quest
import javax.xml.transform.sax.SAXResult

fun main() {
    val Quest1 = Quest(
        title = "Исследовать далекие драконьи земли",
        duration = 20,
        reward = 1200,
        difficulty = "Сложный",
        questType = QuestType.EXPLORE
    )
//    Quest1.describe()
//    Quest1.printInfo()

    val Quest2 = Quest(
        title = "Победить Змеиного потрошителя",
        duration = 5,
        reward = 100000,
        difficulty = "Сложный",
        questType = QuestType.BOSSFIGHT
    )
//    Quest2.describe()
//    Quest2.printInfo()
    val quests = listOf(Quest1, Quest2)
    showExploreQuests(quests)
    val escortQuest = Quest(
       title = "Сопроводи торговца до деревни",
        duration = 4,
       reward = 120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
   escortQuest.printInfo()

//    val missions = listOf<Mission>(
//        Quest(title = "0xora на монстров", 3, 600, "Средний"),
//        SpecialOperation("Ночной рейд", 1500, 2,true),
//        Contract(title = "Сопровождение каравана","Гильдия Торговцев", "Доставить груз через лес", 800, true)
//    )
//
//    for (mission in missions) {
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
//        println()
//    }


//    val quest= Quest("Поиск артефактов",3,800,"Средний")
//    val contract = Contract("Защита каравана","Гильдия Купцов","Охрана груза", 1200)
//    val specialOp = Specialoperation("Операция тень",2500,2,true)
//    println("Информаиця о кветсе: ")
//    println("Название: ${quest.title} награда ${quest.reward}")
//
//    println("Информаиця о Контракте: ")
//    println("Название: ${contract.title} заказчик ${contract.clientname}")
//
//    println("Информаиця о спецоперации: ")
//    println("Название: ${specialOp.title}")
//
//    specialOp.showReward()


//    val quest = world.Quest("охота на гобюлинов", 3, 5000, "Легкий")
//    val quest = Quest("Побег из замка", 5,700,"Сложный")
//    println(quest.isHard())


//    print("Введите название квеста: ")
//    val title = readln()
//    print("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//    print("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//    print("Введите уровень сложности: ")
//    val difficulty = readln()
//    quest.title = title
//    quest.duration = duration
//    quest.reward = reward
//    quest.difficulty = difficulty
//    println("Название квеста : ${quest.title} Время выполнения: ${quest.duration} Нарграда: ${quest.reward} золотых уровень сложности ${quest.difficulty}")
//
//    quest.printInfo()
//
//    quest.init(title="Охота на тролля",duration=3,reward=500,difficulty="Средний")
//
//
//
//
//
//    val quests = mutableListOf<world.Quest>()
//    for (i in 1 ..3){
//        println("Добавим квест #$i")
//        val q = world.Quest()
//        print("Название: ")
//        val title = readln()
//        print("Время (ч): ")
//        val duration = readln().toInt()
//        print("Награда: ")
//        val reward = readln().toInt()
//        print("Сложность: ")
//        val difficulty = readln()
//        q.init(title,duration,reward,difficulty)
//        quests.add(q)
//        println()
//    }
//    for (q in quests){
//        q.printInfo()
//    }

//    val artur = Student()
//    artur.init("artur",18)
//    artur.introduce()
//    val alina = Student()
//    alina.init("alina",17)
//    val isp_233 = Group()
//    isp_233.init("ИСП-233")
//    isp_233.addStudent(artur)
//    isp_233.addStudent(alina)
//
//    isp_233.listStudents()
//    isp_233.celebrateBirthdays()
//
//    isp_233.listStudents()


//    val alt = GeometryCalculator()
//    alt.triangleInfo(3.0, 4.0, 5.0)
//    alt.rectangleInfo(4.0, 5.0)
//    alt.circleInfo(5.0)

}
fun showExploreQuests(quests: List<Quest>) {
    println("Квесты типа EXPLORE")
    quests.filter { it.questType == QuestType.EXPLORE }
        .forEach {
            it.describe()
            it.printInfo()
            println()
        }
}