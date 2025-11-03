package lotto.view

import lotto.common.Messages
import lotto.model.Lotto
import lotto.model.Rank
import lotto.model.Statistics

object OutputView {

    fun printPurchasedLotto(chances: List<Lotto>) {
        println("${chances.size}${Messages.NUMBER_OF_PURCHASES.message}")
        chances.forEach { chance ->
            println(chance.getSortedNumbers())
        }
    }

    fun printStatistics(statistics: Statistics) {
        println("\n${Messages.WINNING_STATISTICS.message}")
        println(Messages.DIVIDING_LINE.message)
        Rank.entries.toTypedArray().reversedArray().filter { it != Rank.NONE }.forEach { rank ->
            val count = statistics.results[rank] ?: 0
            val messageFormat = getMessage(rank)
            println(String.format(messageFormat, count))
        }
    }

    private fun getMessage(rank: Rank): String {
        return when (rank) {
            Rank.FIFTH -> Messages.MESSAGE_THREE_MATCHES.message
            Rank.FOURTH -> Messages.MESSAGE_FOUR_MATCHES.message
            Rank.THIRD -> Messages.MESSAGE_FIVE_MATCHES.message
            Rank.SECOND -> Messages.MESSAGE_FIVE_AND_BONUS_MATCHES.message
            Rank.FIRST -> Messages.MESSAGE_SIX_MATCHES.message
            Rank.NONE -> ""
        }
    }

    fun printRate(rate: Double) {
        val formattedRate = String.format("%.1f", rate)
        println(String.format(Messages.TOTAL_PROFIT_GUIDANCE.message, formattedRate))
    }

    fun printError(message: String?) {
        if (message != null) {
            println(message)
        }
    }
}