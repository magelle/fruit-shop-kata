package discount


val fruitDiscount = buildDiscount(discount = 200, every = 5, fruitsWhich = ::anyFruit)

private fun anyFruit(fruit: String) = true