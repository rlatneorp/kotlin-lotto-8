package lotto.model

import lotto.common.ErrorMessages
import lotto.common.LottoConstants

class Bonus(val bonus: Int) {
    init {
        require(bonus in LottoConstants.MIN_NUMBER..LottoConstants.MAX_NUMBER ) { ErrorMessages.INVALID_LOTTO_NUMBER_RANGE.message }
    }
}