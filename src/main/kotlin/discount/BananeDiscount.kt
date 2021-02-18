package discount

import BANANES

val bananeDiscount = buildDiscount(discount = 150, every = 2, fruitsWhich = ::isABanane)

private fun isABanane(fruit: String) = fruit == BANANES