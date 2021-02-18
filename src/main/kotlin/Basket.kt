import FruitPrices.getPrice

class Basket(
    private val discounts: (List<String>) -> Int
) {
    private val fruits = mutableListOf<String>()

    fun add(fruit: String) {
        fruits.add(fruit)
    }

    fun total() = fruits
        .sumBy { getPrice(it) } + discounts(fruits)

}


