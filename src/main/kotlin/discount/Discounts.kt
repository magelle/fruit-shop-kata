import discount.applesDiscount
import discount.bananeDiscount
import discount.ceriseDiscount
import discount.meleDiscount

fun applyDiscounts(fruits: List<String>) =
    listOf(::ceriseDiscount, ::bananeDiscount, ::applesDiscount, ::meleDiscount)
        .map { it(fruits) }
        .sum()
        .unaryMinus()