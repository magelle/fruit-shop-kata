package discount

import APPLES

fun applesDiscount(fruits: List<String>) =
    (fruits.filter { it == APPLES }.count() / 3) * 100