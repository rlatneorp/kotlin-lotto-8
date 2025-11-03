package lotto

import lotto.model.Rank
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RankTest {

    @ParameterizedTest
    @CsvSource(
        "6, false, FIRST",
        "5, true, SECOND",
        "5, false, THIRD",
        "4, false, FOURTH",
        "4, true, FOURTH",
        "3, false, FIFTH",
        "3, true, FIFTH",
        "2, false, NONE",
        "1, true, NONE",
        "0, false, NONE"
    )
    fun `로또 당첨 순위 제대로 반환하는지`(matchCount: Int, matchBonus: Boolean, expectedRank: Rank) {
        val rank = Rank.getRank(matchCount, matchBonus)
        assertThat(rank).isEqualTo(expectedRank)
    }

    @Test
    fun `FIRST 등수의 상금은 20억`() {
        assertThat(Rank.FIRST.prize).isEqualTo(2_000_000_000L)
    }

    @Test
    fun `NONE 등수의 상금은 0인지`() {
        assertThat(Rank.NONE.prize).isEqualTo(0L)
    }
}
