package magic

class Spell(
    name: String,
    val width: Int = 0,
    val heihgt: Int = 0,
    symbol: String
): MagicEffect(name,symbol,10) {


    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)

    fun cast() {
        repeat(heihgt) {
            repeat(width) {
                print(symbol)
            }
            println()
        }
    }
    fun area(): Int{
        return width*heihgt
    }

    fun description(): String{
        return "Заклинание $name занимает область ${width}x$heihgt и использует символ $symbol"
    }
}