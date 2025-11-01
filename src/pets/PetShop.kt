package pets


fun main() {
    var pet = listOf(Wolf("Фенрир"),Cat("Мурзик"), Eagle("Скайвинд"), Bear("Балу"));
    for (i in pet) {
        i.describe();
        i.makeSound();
    }
}