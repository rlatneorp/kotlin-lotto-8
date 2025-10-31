package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.common.Messages

class InputView {
    fun getLottoPurchaseAmount(): Int {
        println(Messages.INPUT_LOTTO_PURCHASE_AMOUNT)
        return Console.readLine().toInt()
    }

}