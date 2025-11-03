package lotto.model

import lotto.common.ErrorMessages

class Goal (
    val lotto: Lotto,
    val bonus: Bonus
) {

    init {
        require(!lotto.calculationNumber(bonus.bonus)) {
            ErrorMessages.DUPLICATE_BONUS_NUMBER.message
        }
    }
}