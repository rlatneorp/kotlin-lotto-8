package lotto

import lotto.model.Amount
import lotto.service.LottoService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoServiceTest {
    @Test
    fun `8000원을 내면 로또 8장을 발행하는지`() {
        val amount = Amount(8000)
        val lottoService = LottoService()
        val tickets = lottoService.sellLottoCount(amount)
        assertThat(tickets.size).isEqualTo(8)
    }

    @Test
    fun `1000원을 내면 로또 1장을 발행하는지`() {
        val amount = Amount(1000)
        val lottoService = LottoService()
        val tickets = lottoService.sellLottoCount(amount)
        assertThat(tickets.size).isEqualTo(1)
    }

    @Test
    fun `발행된 모든 로또는 6개의 번호를 가지는지`() {
        val amount = Amount(3000)
        val lottoService = LottoService()
        val tickets = lottoService.sellLottoCount(amount)
        assertThat(tickets).allSatisfy { lotto ->
            assertThat(lotto.getSortedNumbers().size).isEqualTo(6)
        }
    }
}