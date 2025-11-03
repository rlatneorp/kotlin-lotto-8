package lotto.service

import lotto.model.Goal
import lotto.model.Lotto
import lotto.model.Rank
import lotto.model.Statistics

class StatisticsService {

    fun calculateStats(count: List<Lotto>, goal: Goal): Statistics {
        val results = mutableMapOf<Rank, Int>().withDefault { 0 }
        val goalNumbers = goal.lotto.getSortedNumbers()
        val bonusNumber = goal.bonus.bonus

        count.forEach { count ->
            val matchCount = count.getMatchCount(goalNumbers)
            val matchBonus = count.calculationNumber(bonusNumber)
            val rank = Rank.getRank(matchCount, matchBonus)
            if (rank != Rank.NONE) {
                results[rank] = results.getValue(rank) + 1
            }
        }
        return Statistics(results)
    }
}