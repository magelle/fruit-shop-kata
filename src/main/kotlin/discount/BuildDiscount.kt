package discount

fun buildDiscount(
    discount: Int,
    every: Int,
    fruitsWhich: (String) -> Boolean
) = { fruits: List<String> -> (fruits.count { fruitsWhich(it) } / every) * discount }