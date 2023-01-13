import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcPriceShouldNotAddDiscount() {
        val itemPrice = 100
        val itemCount = 1
        val discount = 10
        val discountStart = 1000
        val level = "gold"

        val result = calcPrice(level, itemCount, itemPrice, discount, discountStart)

        assertEquals(90, result)
    }

    @Test
    fun calcPriceShouldAddDiscount() {
        val itemPrice = 1000
        val itemCount = 1
        val discount = 10
        val discountStart = 100
        val level = "gold"

        val result = calcPrice(level, itemCount, itemPrice, discount, discountStart)

        assertEquals(891, result)
    }
}