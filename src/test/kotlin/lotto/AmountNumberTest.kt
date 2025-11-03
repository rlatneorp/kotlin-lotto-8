package lotto

import lotto.model.Amount
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AmountNumberTest() {
    @Test
    fun `구매금액이 음수일 경우`() {
        assertThrows<IllegalArgumentException> {
            Amount(-1)
        }
    }

    @Test
    fun `구매금액에 문자가 들어갈 경우`() {
        assertThrows<IllegalArgumentException> {
            Amount("1000원".toInt())
        }
    }

    @Test
    fun `구매 금액이 0일 경우`() {
        assertThrows<IllegalArgumentException> {
            Amount(0)
        }
    }

    @Test
    fun `로또구매 금액이 1000원 단위가 아닌 경우`() {
        assertThrows<IllegalArgumentException> {
            Amount(1111)
        }
    }
}