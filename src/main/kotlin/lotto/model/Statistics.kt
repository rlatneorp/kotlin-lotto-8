package lotto.model

import kotlin.math.round

class Statistics(
    val results: Map<Rank, Int>
) {

    fun calculateStats(amount: Amount): Double {
        val totalPrize = results.entries.sumOf { (rank, count) ->
            rank.prize * count
        }
        if (amount.amount == 0) return 0.0
        val rate = totalPrize.toDouble() / amount.amount.toDouble()
        return round(rate * 100 * 10) / 10.0
    }
}