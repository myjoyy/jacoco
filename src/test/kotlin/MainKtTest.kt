import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun testJustNow() {
        val result = agoToText(30)
        assertEquals("Только что", result)
    }

    @Test
    fun testMinutesAgo() {
        val result = agoToText(90)
        assertEquals("1 минуты назад", result)
    }

    @Test
    fun testHoursAgo() {
        val result = agoToText(7200)
        assertEquals("2 часа назад", result)
    }

    @Test
    fun testYesterday() {
        val result = agoToText(3600 * 25)
        assertEquals("вчера", result)
    }
}