package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.common.Messages

object InputView {
    fun getLottoPurchaseAmount(): Int {
        println(Messages.INPUT_LOTTO_PURCHASE_AMOUNT)
        return Console.readLine().toInt()
    }

    fun getLottoNumber(): MutableList<String> {
        println(Messages.INPUT_THE_WINNING_NUMBER)
        return Console.readLine().split(",").toMutableList()
    }

}