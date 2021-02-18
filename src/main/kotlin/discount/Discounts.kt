import discount.*

fun applyDiscounts(fruits: List<String>) =
    listOf(::ceriseDiscount, ::bananeDiscount, ::applesDiscount, ::meleDiscount, ::allAppleTypesDiscount, ::fruitDiscount)
        .map { it(fruits) }
        .sum()
        .unaryMinus()