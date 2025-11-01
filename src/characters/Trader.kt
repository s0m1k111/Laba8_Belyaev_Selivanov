package characters

import  world.Quest
import world.QuestType

class Trader(val name: String, private val quests: MutableList<Quest> = mutableListOf()) {

    fun showAvailableQuests() {
        println("Доступные квесты от $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }

    fun giveQuest(index: Int): Quest? {
        return quests[index - 1]
    }

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name.")
    }

    fun removeQuest(index: Int) {
        quests.removeAt(index)
        println("Задача удалена")
    }

    fun start() {
        while (true) {
            println("Выберете действие:")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Удалить квест из списка")
            println("0 - Выйти")
            println("Ваш выбор: ")
            when (readln()){
                "1" -> {
                    print("Название: ")
                    val title = readln()
                    print("Длительность: ")
                    val duration = readln().toIntOrNull() ?: 1
                    print("Награда: ")
                    val reward = readln().toIntOrNull() ?: 0
                    print("Сложность: ")
                    val difficulty = readln()
                    println("Выберите тип квеста:")
                    QuestType.values().forEachIndexed { index, type ->
                        println("${index + 1}. ${type.description}")
                    }
                    val typeChoice = readln().toIntOrNull()
                    val questType = if (typeChoice != null && typeChoice in 1..QuestType.values().size) {
                        QuestType.values()[typeChoice - 1]
                    } else QuestType.DELIVERY

                    val newQuest = Quest(title, duration, reward, difficulty, questType)
                    addQuest(newQuest)





                }
                "2" -> {
                    showAvailableQuests()
                }
                "3" -> {
                    if (quests.isEmpty()) {
                        println("Список пуст")
                    } else {
                        println("Задачи для удаления: ")
                        quests.forEachIndexed { index, task ->
                            println("${index + 1}. ${task.title}")
                        }
                        print("Введите номер задачи для удаления: ")
                        val num = readln().toIntOrNull()
                        if (num == null || num !in 1..quests.size) {
                            println("некорректный номер")
                        } else {
                            removeQuest(num-1)
                        }
                    }
                }
                "0" -> {
                    println("Вышли")
                    break
                }
                else -> println("Некорректный ввод. Попробуйте снова.")
            }

        }


    }

}