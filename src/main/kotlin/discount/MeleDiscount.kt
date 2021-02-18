package discount

import MELE


fun meleDiscount(fruits: List<String>) =
    (fruits.filter { it == MELE }.count() / 2) * 100