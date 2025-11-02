package lotto.util

import lotto.common.ErrorMessages

object InputValidator {

    fun validateAmount(input : String) {
        validateAmountUnit(input)
        validateEmptyAmount(input)
    }

    private fun validateAmountUnit(input: String) {
        if (input.any { !it.isDigit() }) {
            throw IllegalArgumentException(ErrorMessages.INVALID_AMOUNT_OF_PURCHASE_TYPE.message)
        }
    }

    private fun validateEmptyAmount(input: String) {
        if (input.isEmpty()) {
            throw IllegalArgumentException(ErrorMessages.EMPTY_AMOUNT_NUMBER.message)
        }
    }
}