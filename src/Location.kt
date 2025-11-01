import com.sun.net.httpserver.Request

class Location (
    val name: String = "Арбузное поле",
    val dangerLevel: String="Высокий",
    val requiredLevel: Int= 100000
){
    fun isDangerous(): Boolean{
        if (dangerLevel == "Высокий"){
            return true
        }
        else{
            return false
        }
    }
}