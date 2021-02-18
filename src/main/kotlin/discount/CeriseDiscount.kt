package discount

import CERISES

fun ceriseDiscount(fruits: List<String>) =
    (fruits.filter { it == CERISES }.count() / 2) * 20