package lotto.util

import lotto.model.RandomNumbers
import kotlin.collections.filter
import kotlin.text.isNotBlank

object InputParser {

    fun parseNumber(input: String): Int {
        return input.toInt()
    }

    fun parseLottoNumber(input: String): List<Int> {
        return input.split(",")
            .filter { it.isNotBlank() }
            .map { it.toInt() }
    }

}