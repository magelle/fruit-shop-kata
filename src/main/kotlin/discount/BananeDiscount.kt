package discount

import BANANES

fun bananeDiscount(fruits: List<String>) =
    (fruits.filter { it == BANANES }.count() / 2) * 150