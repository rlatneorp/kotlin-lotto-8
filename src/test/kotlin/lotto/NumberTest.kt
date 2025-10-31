package lotto

import lotto.model.Amount
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AmountNumberTest{

    @Test
    fun `로또구매 금액이 1000원 단위가 아닌 경우`() {
        assertThrows<IllegalArgumentException> {
            Amount(1100)
        }
    }

    @Test
    fun `구매금액 0원 입력`() {
        assertThrows<IllegalArgumentException> {
            Amount(0)
        }
    }

}