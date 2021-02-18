package discount

import CERISES

val ceriseDiscount = buildDiscount(20, 2, ::isACerises)

fun isACerises(fruit: String) = fruit == CERISES