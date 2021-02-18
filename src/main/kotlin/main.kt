fun main(args: Array<String>) {
    val basket = Basket(::applyDiscounts)
    generateSequence { readLine() }
        .forEach {
            parse(it).forEach(basket::add)
            println(basket.total())
        }
}