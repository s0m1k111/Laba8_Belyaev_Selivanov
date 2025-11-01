class Item(
    val name: String,
    val type: String,
    val value: Int
) {
    constructor(name: String, type: String): this(name = name,type=type,value =0)

    fun printInfo(){
        println("$name, $type , $value")
    }
}