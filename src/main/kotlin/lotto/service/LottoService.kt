package lotto.service

import camp.nextstep.edu.missionutils.Randoms
import lotto.common.LottoConstants
import lotto.model.Amount
import lotto.model.Lotto

class LottoService(){
    fun sellLottoCount(amount: Amount): List<Lotto> {
        val count = amount.getCount()
        return List(count) { generateLottoNumber() }
    }

    private fun generateLottoNumber(): Lotto {
        val numbers = Randoms.pickUniqueNumbersInRange(
            LottoConstants.MIN_NUMBER,
            LottoConstants.MAX_NUMBER,
            LottoConstants.NUMBER_COUNT
        )
        return Lotto(numbers)
    }
}