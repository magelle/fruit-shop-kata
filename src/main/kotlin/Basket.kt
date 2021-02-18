import FruitPrices.getPrice

class Basket(
    private val discounts: (List<String>) -> Int
) {
    private val fruits = mutableListOf<String>()

    fun add(fruit: String) = fruits.add(fruit)

    fun total() = sum(fruits) - discounts(fruits)

    private fun sum(fruits: List<String>) =
        fruits.sumBy { getPrice(it) }

}


