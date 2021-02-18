import discount.*

private val ALL_DISCOUNTS = listOf(
    ceriseDiscount,
    bananeDiscount,
    applesDiscount,
    meleDiscount,
    allAppleTypesDiscount,
    fruitDiscount
)

fun applyDiscounts(fruits: List<String>): Int {
    return ALL_DISCOUNTS.sumBy { it(fruits) }
}