fun main(args: Array<String>) {
    val basket = Basket(::applyDiscounts, Translator())
    generateSequence { readLine() }
        .forEach {
            basket.add(it)
            println(basket.total())
        }
}