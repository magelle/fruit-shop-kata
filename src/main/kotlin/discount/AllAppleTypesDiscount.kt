package discount

import APPLES
import MELE
import POMMES

val allApples = listOf(APPLES, MELE, POMMES)

val allAppleTypesDiscount = buildDiscount(discount = 100, every = 4, fruitsWhich = ::isAnyApple)
private fun isAnyApple(fruit: String) = allApples.contains(fruit)