package discount

fun ceriseDiscount(fruits: List<String>) =
    (fruits.filter { it == "Cerise" }.count() / 2) * 20