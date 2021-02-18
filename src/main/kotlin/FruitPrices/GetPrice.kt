package FruitPrices

import APPLES
import BANANES
import CERISES
import MELE
import POMMES
import java.lang.IllegalArgumentException

fun getPrice(fruit: String): Int =
    when (fruit) {
        CERISES -> 75
        BANANES -> 150
        POMMES -> 100
        APPLES -> getPrice(POMMES)
        MELE -> getPrice(POMMES)
        else -> throw IllegalArgumentException("Unknown fruit : $fruit")
    }