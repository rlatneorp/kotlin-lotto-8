package lotto

import lotto.validator.Validator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AmountNumberTest {

    @Test
    fun `로또구매 금액이 1000원 단위가 아닌 경우`() {
        assertThrows<IllegalArgumentException> {
            Validator.validateThousandsUnit(1100)
        }
    }

    @Test
    fun `구매금액 0원 입력`() {
        assertThrows<IllegalArgumentException> {
            Validator.validateEmptyPurchaseAmount(0)
        }
    }

    @Test
    fun `구매금액이 음수일 경우`() {
        assertThrows<IllegalArgumentException> {
            Validator.validatePositiveAmount(-1)
        }
    }

    @Test
    fun `구매금액에 문자가 들어갈 경우`() {
        assertThrows<IllegalArgumentException> {
            Validator.validatePurchaseAmountType("1000원")
        }
    }
}