package lotto.model

enum class Rank(val matchCount: Int, val prize: Long, val bonus: Boolean = false) {
    FIRST(6, 2_000_000_000L),
    SECOND(5, 30_000_000L, true),
    THIRD(5, 1_500_000L),
    FOURTH(4, 50_000L),
    FIFTH(3, 5_000L),
    NONE(0, 0L);

    companion object {
        fun getRank(matchCount: Int, matchBonus: Boolean): Rank {
            if (matchCount == 6) return FIRST
            if (matchCount == 5 && matchBonus) return SECOND
            if (matchCount == 5) return THIRD
            if (matchCount == 4) return FOURTH
            if (matchCount == 3) return FIFTH
            return NONE
        }
    }
}
