package lotto

import lotto.controller.Controller
import lotto.service.LottoService
import lotto.service.StatisticsService

fun main() {
    val lottoMachine = LottoService()
    val statisticsCalculator = StatisticsService()
    val controller = Controller(lottoMachine, statisticsCalculator)
    controller.run()
}


