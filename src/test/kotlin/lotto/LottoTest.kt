package lotto

import lotto.model.Lotto
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {
    @Test
    fun `로또 번호의 개수가 6개가 넘어가면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 6, 7))
        }
    }

    // TODO: 테스트가 통과하도록 프로덕션 코드 구현
    @Test
    fun `로또 번호에 중복된 숫자가 있으면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 5))
        }
    }

    // TODO: 추가 기능 구현에 따른 테스트 코드 작성
    @Test
    fun `로또 번호에 0이 들어간 경우`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(0, 2, 3, 4, 5, 6))
        }
    }

    @Test
    fun `로또 번호가 비어있는 경우`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf())
        }
    }

    @Test
    fun `번호를 오름차순으로 정렬하여 반환`() {
        val numbers = listOf(6, 5, 4, 3, 2, 1)
        val lotto = Lotto(numbers)
        val sortedNumbers = lotto.getSortedNumbers()
        assertThat(sortedNumbers).isEqualTo(listOf(1, 2, 3, 4, 5, 6))
    }
}
