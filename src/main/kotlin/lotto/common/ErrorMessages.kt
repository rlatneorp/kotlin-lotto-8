package lotto.common

enum class ErrorMessages(val message: String) {
    EMPTY_AMOUNT_NUMBER("[ERROR] 로또 구매 금액에 공백이 들어갈 수 없습니다"),
    NOT_THOUSAND_WON_UNIT("[ERROR] 로또 구매 금액은 1000원 단위로 입력해주세요."),
    INVALID_AMOUNT_OF_PURCHASE("[ERROR] 구매 금액은 0원일 수 없습니다."),
    INVALID_AMOUNT_OF_PURCHASE_TYPE("[ERROR] 구매 금액에 문자를 입력할 수 없습니다."),
    EMPTY_LOTTO_NUMBER("[ERROR] 번호에 공백이 들어갈 수 없습니다."),
    INVALID_LOTTO_NUMBER_RANGE("[ERROR] 번호는 1 ~ 45까지의 숫자만 입력할 수 있습니다."),
    REPETITION_LOTTO_NUMBER("[ERROR] 범위 내 중복 되지 않은 수만 입력 가능합니다."),
    INVALID_SIX_LOTTO_NUMBERS("[ERROR] 로또 번호는 6개여야 합니다.")
}