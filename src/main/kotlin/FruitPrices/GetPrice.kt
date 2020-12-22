package FruitPrices

import java.lang.IllegalArgumentException

fun getPrice(fruit: String): Int =
    when (fruit) {
        "Cerise" -> 75
        "Banane" -> 150
        "Pomme" -> 100
        else -> throw IllegalArgumentException("")
    }