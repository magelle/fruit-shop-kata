package discount

import MELE


val meleDiscount = buildDiscount(
    discount = 100,
    every = 2,
    fruitsWhich = ::isAMele)

private fun isAMele(fruit: String) = fruit == MELE