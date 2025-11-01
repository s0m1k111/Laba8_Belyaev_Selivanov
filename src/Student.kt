class Student {
    var name: String = "none"
    var age: Int = 18
    fun init(name: String, age: Int) {
        this.name = name
        this.age = age
        println("Объект создан")
    }

    fun introduce() {
        println("меня зовут ${this.name} , мне ${this.age}лет")
    }


    fun haveBirthday(){
        this.age += 1
        println("Денис празднует день рождения! теперь ему ${this.age}")
    }


}