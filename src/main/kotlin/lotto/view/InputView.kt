package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.common.Messages

object InputView {
    fun getLottoPurchaseAmount(): String {
        println(Messages.INPUT_LOTTO_PURCHASE_AMOUNT.message)
        return Console.readLine()
    }

    fun getLottoNumber(): String {
        println(Messages.INPUT_THE_WINNING_NUMBER.message)
        return Console.readLine()
    }

}