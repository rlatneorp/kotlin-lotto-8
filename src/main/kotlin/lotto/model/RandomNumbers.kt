package lotto.model

import camp.nextstep.edu.missionutils.Randoms
import lotto.common.LottoConstants


class RandomNumbers(private val amount: Amount){
    private val numbers = mutableListOf<Int>()

    fun getRandom(): MutableList<Int> {
        val count = amount.getCount()
        for (i in 1..count) {
            val pickedNumber = Randoms.pickUniqueNumbersInRange(LottoConstants.MIN_NUMBER, LottoConstants.MAX_NUMBER, LottoConstants.NUMBER_COUNT)
            numbers.addAll(pickedNumber)
        }
        return numbers
    }

    fun sortRandom(): List<Int> {
        return getRandom().sorted()
    }

}