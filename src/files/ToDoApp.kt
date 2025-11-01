package files

import java.io.File

fun main() {
    val file = File("toDo.txt")
    while (true) {
        println("\n=== МЕНЮ ЗАДАЧ ===")
        println("1 - Добавить задачу")
        println("2 - Показать все задачи")
        println("3 - Удалить задачу")
        println("0 - Выход")
        print("Выберите действие: ")
        when (readln()) {
            "1" -> {
                print("Введите новую задачу: ")
                val task = readln()
                file.appendText("$task\n")
                println("Добавлена")
            }

            "2" -> {
                println("Все задачи: ")
                if (file.exists() && file.readLines().isNotEmpty()) {
                    file.readLines().forEachIndexed { index, task -> println("${index + 1}. $task") }
                } else {
                    println("Список задач пуст")
                }
            }

            "3" -> {
                val tasks = file.readLines().toMutableList()
                if (tasks.isEmpty()) {
                    println("Список пуст")
                } else {
                    println("Задачи для удаления: ")
                    tasks.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                    print("Введите номер задачи для удаления: ")
                    val num = readln().toIntOrNull()
                    if (num == null || num !in 1..tasks.size) {
                        println("некорректный номер")
                    } else {
                        val removed = tasks.removeAt(num - 1)
                        file.writeText("")
                        tasks.forEach { file.appendText("$it\n") }
                        println("Задача \"$removed\" удалена.")

                    }
                }
            }

            "0" -> {
                println("Выход из программы")
                break
            }

            else -> println("Некорректный ввод. Попробуйте снова.")
        }
    }

}