package discount

fun bananeDiscount(fruits: List<String>) =
    (fruits.filter { it == "Banane" }.count() / 2) * 150