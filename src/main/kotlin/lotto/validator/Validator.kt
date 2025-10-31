package lotto.validator

import lotto.common.ErrorMessages

object Validator {
    private const val THOUSANDS_UNIT = 1000
    private const val ZERO = 0

    fun validateThousandsUnit(input: Int) {
        if (input % THOUSANDS_UNIT != ZERO) {
            throw IllegalArgumentException(ErrorMessages.NOT_THOUSAND_WON_UNIT.message)
        }
    }

    fun validateEmptyPurchaseAmount(input: Int) {
        if (input == ZERO){
            throw IllegalArgumentException(ErrorMessages.INVALID_AMOUNT_OF_PURCHASE.message)
        }
    }

    fun validatePositiveAmount(input: Int) {
        if (input < ZERO){
            throw IllegalArgumentException(ErrorMessages.INVALID_POSITIVE_NUMBER.message)
        }
    }

    fun validatePurchaseAmountType(input: String) {
        if (input.any { it.isLetter() }) {
            throw IllegalArgumentException(ErrorMessages.INVALID_AMOUNT_OF_PURCHASE_TYPE.message)
        }
    }
}