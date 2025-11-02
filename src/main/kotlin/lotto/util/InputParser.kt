package lotto.util

import lotto.common.LottoConstants
import kotlin.collections.filter
import kotlin.text.isNotBlank

object InputParser {

    fun parseAmount(input: String): Int {
        return input.toInt()
    }

    fun parseLottoNumber(input: String): List<Int> {
        return input.split(",")
            .filter { it.isNotBlank() }
            .map { it.toInt() }
    }
}