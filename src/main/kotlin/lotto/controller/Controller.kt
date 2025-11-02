package lotto.controller

import lotto.model.Lotto
import lotto.model.Amount
import lotto.util.InputParser
import lotto.util.InputValidator
import lotto.view.InputView

class Controller {
    fun run() {
        try {
            getMoney()
            getLottoNumbers()
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    fun getMoney(): Amount {
        val inputPurchase = InputView.getLottoPurchaseAmount()
        InputValidator.validateAmount(inputPurchase)
        val amountParser = InputParser.parseAmount(inputPurchase)
        return Amount(amountParser)
    }

    fun getLottoNumbers(): Lotto {
        val inputLottoNumber = InputView.getLottoNumber()
        val lottoNumberParser = InputParser.parseLottoNumber(inputLottoNumber)
        return Lotto(lottoNumberParser)
    }
}