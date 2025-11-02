package lotto.common

enum class Messages(val message: String) {
    INPUT_LOTTO_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    NUMBER_OF_PURCHASES("개를 구매했습니다."),
    INPUT_THE_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    INPUT_THE_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    WINNING_STATISTICS("당첨통계"),
    DIVIDING_LINE("---"),
    MESSAGE_THREE_MATCHES("3개 일치 (5,000원) - %d개"),
    MESSAGE_FOUR_MATCHES("4개 일치 (50,000원) - %d개"),
    MESSAGE_FIVE_MATCHES("5개 일치 (1,500,000원) - %d개"),
    MESSAGE_FIVE_AND_BONUS_MATCHES("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개"),
    MESSAGE_SIX_MATCHES("6개 일치 (2,000,000,000원) - %d개"),
    TOTAL_PROFIT_GUIDANCE("총 수익률은 %d%입니다."),
    NUMBER_OF_ZERO("0")
}