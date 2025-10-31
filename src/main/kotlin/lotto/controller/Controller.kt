package lotto.controller

import lotto.validator.Validator
import lotto.view.InputView

class Controller {
    fun run() {
        val input = InputView.getLottoPurchaseAmount()
        Validator.validateThousandsUnit(input)
    }
}