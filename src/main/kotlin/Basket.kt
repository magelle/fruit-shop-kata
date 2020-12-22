import FruitPrices.getPrice

class Basket(
    private val discounts: (List<String>) -> Int,
    private val translator: Translator) {
    private val fruits = mutableListOf<String>()

    fun add(fruit: String) {
        fruits.add(fruit)
    }

    fun total() = fruits
        .map { translator.translate(it) }
        .sumBy { getPrice(it) } + discounts(fruits)

}


