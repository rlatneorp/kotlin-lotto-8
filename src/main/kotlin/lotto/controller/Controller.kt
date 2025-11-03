package lotto.controller

import lotto.common.ErrorMessages
import lotto.model.Lotto
import lotto.model.Amount
import lotto.model.Bonus
import lotto.model.Goal
import lotto.service.LottoService
import lotto.service.StatisticsService
import lotto.util.InputParser
import lotto.util.InputValidator
import lotto.view.InputView
import lotto.view.OutputView

class Controller(
    private val lottoService: LottoService,
    private val statisticsService: StatisticsService
) {

    fun run() {
        try {
            val amount = getCount()
            val count = lottoService.sellLottoCount(amount)
            OutputView.printPurchasedLotto(count)
            val goal = getGoalLotto()
            val statistics = statisticsService.calculateStats(count, goal)
            OutputView.printStatistics(statistics)
            val getRate = statistics.calculateStats(amount)
            OutputView.printRate(getRate)
        } catch (e: IllegalArgumentException) {
            OutputView.printError(e.message)
        } catch (e: IllegalArgumentException) {
            OutputView.printError(ErrorMessages.INVALID_AMOUNT_OF_PURCHASE_TYPE.message)
        }
    }

    private fun getCount(): Amount {
        val inputPurchase = InputView.getLottoPurchaseAmount()
        InputValidator.validateNumber(inputPurchase)
        val parsedAmount = InputParser.parseNumber(inputPurchase)
        return Amount(parsedAmount)
    }

    private fun getLottoNumbers(): Lotto {
        val input = InputView.getLottoNumber()
        InputValidator.validateLottoFormat(input)
        val parsedNumbers = InputParser.parseLottoNumber(input)
        return Lotto(parsedNumbers)
    }

    private fun getBonusNumber(): Bonus {
        val inputBonus = InputView.getBonusNumber()
        InputValidator.validateNumber(inputBonus)
        val bonusParser = InputParser.parseNumber(inputBonus)
        return Bonus(bonusParser)
    }

    private fun getGoalLotto(): Goal {
        val winningNumbers = getLottoNumbers()
        val bonusNumber = getBonusNumber()
        return Goal(winningNumbers, bonusNumber)
    }

}
