package items

class Item(val name: String="", val price: Int=0) {
    fun displayInfo() {
        println("Item: $name | Price: $price")
    }
}