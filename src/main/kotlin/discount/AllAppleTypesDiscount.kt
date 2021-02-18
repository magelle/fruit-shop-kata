package discount

import APPLES
import MELE
import POMMES

val allApples = listOf(APPLES, MELE, POMMES)

fun allAppleTypesDiscount(fruits: List<String>) =
    (fruits.filter { allApples.contains(it)  }.count() / 4) * 100