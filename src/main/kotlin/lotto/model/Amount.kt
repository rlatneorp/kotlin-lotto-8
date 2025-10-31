package lotto.model

data class Amount(
    val money: Int,
    val count: Int
) {

    fun getTime(): Int {
        return money / 1000
    }

}