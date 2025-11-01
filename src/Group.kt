class Group {
    var groupName: String = "none"
    var students:  MutableList<Student> = mutableListOf()

    fun init(groupName: String){
        this.groupName = groupName
    }

    fun  listStudents(){
        println("Студенты группы ${this.groupName}")
        for (i in students){
            i.introduce()
        }
    }

    fun celebrateBirthdays() {
        for (student in students) {
            student.haveBirthday()
        }
    }

    fun addStudent(student: Student){
        students.add(student)
    }

}