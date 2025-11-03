package lotto.controller

import lotto.model.Lotto
import lotto.model.Amount
import lotto.model.Bonus
import lotto.util.InputParser
import lotto.util.InputValidator
import lotto.view.InputView

class Controller {
    fun run() {
        try {
            getMoney()
            getLottoNumbers()
            getBonusNumber()
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    fun getMoney(): Amount {
        val inputPurchase = InputView.getLottoPurchaseAmount()
        InputValidator.validateNumber(inputPurchase)
        val amountParser = InputParser.parseNumber(inputPurchase)
        return Amount(amountParser)
    }

    fun getLottoNumbers(): Lotto {
        val inputLottoNumber = InputView.getLottoNumber()
        val lottoNumberParser = InputParser.parseLottoNumber(inputLottoNumber)
        return Lotto(lottoNumberParser)
    }

    fun getBonusNumber(): Bonus {
        val inputBonus = InputView.getBonusNumber()
        InputValidator.validateNumber(inputBonus)
        val bonusParser = InputParser.parseNumber(inputBonus)
        return Bonus(bonusParser)
    }

    fun getPrizeNumber(): Int {
        getMatchCount

    }
}