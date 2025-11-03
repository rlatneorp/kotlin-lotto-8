package lotto.model

import lotto.common.ErrorMessages
import lotto.common.LottoConstants

class Amount(val amount: Int) {
    init {
        require(amount > LottoConstants.ZERO) { ErrorMessages.INVALID_AMOUNT_OF_PURCHASE.message }
        require(amount % LottoConstants.PURCHASE_UNIT == LottoConstants.ZERO) { ErrorMessages.NOT_THOUSAND_WON_UNIT.message }
    }

    fun getCount(): Int {
        return amount / LottoConstants.PURCHASE_UNIT
    }
}