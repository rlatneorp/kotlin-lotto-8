package lotto.model

import lotto.common.ErrorMessages
import lotto.common.LottoConstants

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == LottoConstants.NUMBER_COUNT) { ErrorMessages.INVALID_SIX_LOTTO_NUMBERS.message }
        require(numbers.size == numbers.toSet().size) { ErrorMessages.REPETITION_LOTTO_NUMBER.message }
        require(numbers.all { it in LottoConstants.MIN_NUMBER..LottoConstants.MAX_NUMBER }) { ErrorMessages.INVALID_LOTTO_NUMBER_RANGE.message }
        require(numbers.isNotEmpty()) { ErrorMessages.EMPTY_NUMBER.message }
    }
    // TODO: 추가 기능 구현

    fun getMatchCount(goalNumbers: List<Int>): Int {
        return this.numbers.count { goalNumbers.contains(it) }
    }

    fun calculationNumber(number: Int): Boolean {
        return numbers.contains(number)
    }

    fun getSortedNumbers(): List<Int> {
        return numbers.sorted()
    }

}