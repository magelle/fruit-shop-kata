package discount

import APPLES

val applesDiscount = buildDiscount(discount = 100, every = 3, fruitsWhich = ::isAnApple)

private fun isAnApple(fruit: String) = fruit == APPLES