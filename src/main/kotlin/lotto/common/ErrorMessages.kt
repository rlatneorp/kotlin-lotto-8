package lotto.common

enum class ErrorMessages(val message: String) {
    NOT_THOUSAND_WON_UNIT("로또 구매 금액은 1000원 단위로 입력해주세요."),
    INVALID_AMOUNT_OF_PURCHASE("구매 금액은 0원일 수 없습니다."),
    INVALID_POSITIVE_NUMBER("구매 금액은 양수만 입력할 수 있습니다."),
    INVALID_AMOUNT_OF_PURCHASE_TYPE("구매 금액에 문자를 입력할 수 없습니다.")
}