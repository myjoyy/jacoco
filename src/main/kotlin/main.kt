fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1000

    val result = calcPrice("gold", 1)
    println("Total price: $result")
}

fun calcPrice(
    userLevel: String = "normal",
    itemCount: Int,
    itemPrice: Int = 100,
    discount: Int = 100,
    discountStart: Int = 1000
): Int{
    val total = itemPrice * itemCount
    val discounted = if (total > discountStart) total - discount else total
    return((1 - userLevelToDiscount(userLevel)) * discounted).toInt()
}

fun userLevelToDiscount(level: String = "normal") = when(level) {
    "gold" -> 0.1
    "silver" -> 0.05
    else -> 0.0
}