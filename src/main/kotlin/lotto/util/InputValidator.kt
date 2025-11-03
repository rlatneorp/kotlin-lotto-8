package lotto.util

import lotto.common.ErrorMessages

object InputValidator {

    fun validateNumber(input : String) {
        validateNumberUnit(input)
        validateEmptyNumber(input)
    }

    private fun validateNumberUnit(input: String) {
        if (input.any { !it.isDigit() }) {
            throw IllegalArgumentException(ErrorMessages.INVALID_AMOUNT_OF_PURCHASE_TYPE.message)
        }
    }

    private fun validateEmptyNumber(input: String) {
        if (input.isEmpty()) {
            throw IllegalArgumentException(ErrorMessages.EMPTY_NUMBER.message)
        }
    }
}