package lotto

import lotto.model.Bonus
import lotto.model.Lotto
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BonusNumberTest {
    @Test
    fun `음수일 경우`() {
        assertThrows<IllegalArgumentException> {
            Bonus(-1)
        }
    }

    @Test
    fun `문자가 들어갈 경우`() {
        assertThrows<IllegalArgumentException> {
            Bonus("1개".toInt())
        }
    }

    @Test
    fun `범위가 1~45가 아닐 때`() {
        assertThrows<IllegalArgumentException> {
            Bonus(46)
        }
    }

    @Test
    fun `번호가 비어있는 경우`() {
        assertThrows<IllegalArgumentException> {
            Bonus("".toInt())
        }
    }
}