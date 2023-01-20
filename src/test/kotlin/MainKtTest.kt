import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun comissionVisa() {
        val result = comission("Visa", 10000, 10000)
        assertEquals(50, result)
    }

    @Test
    fun comissionVisaZero() {
        val result = comission("Visa", 100, 100)
        assertEquals(0, result)
    }

    @Test
    fun comissionMir() {
        val result = comission("Mir", 10000, 10000)
        assertEquals(50, result)
    }

    @Test
    fun comissionMirErr() {
        val result = comission("Mir", 10000, 600000)
        assertEquals(ERR_LIMIT, result)
    }

    @Test
    fun comissionMasterCard() {
        val result = comission("MasterCard", 10000, 10000)
        assertEquals(50, result)
    }

    @Test
    fun comissionMaestro() {
        val result = comission("Maestro", 10000, 10000)
        assertEquals(50, result)
    }

    @Test
    fun comissionVKPay(){
        val result = comission("VKPay", 10000, 10000)
        assertEquals(0,result)
    }
    @Test
    fun comissionVKPayErr(){
        val result = comission("VKPay", 18000, 10000)
        assertEquals(ERR_LIMIT,result)
    }

    @Test
    fun comissionErrType(){
        val result = comission("None", 1500, 1000)
        assertEquals(ERR_TYPE, result)
    }

    //example for agoToText test

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