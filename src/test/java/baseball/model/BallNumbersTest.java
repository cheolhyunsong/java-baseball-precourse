package baseball.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallNumbersTest {
	@Test
	@DisplayName("입력값이 1~9의 숫자인지 검증")
	void valid_if_number_is_between_one_and_nine() {
		assertThatThrownBy(() -> BallNumbers.validScale(0))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> BallNumbers.validScale(10))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}

	@Test
	@DisplayName("3자릿수 입력 검증")
	void valid_cipher() {
		assertThatThrownBy(() -> BallNumbers.validCipher(Arrays.asList(8, 2)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(BallNumbers.DIGIT));

		assertThatThrownBy(() -> BallNumbers.validCipher(Arrays.asList(1, 6, 4, 5)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(BallNumbers.DIGIT));
	}

	@Test
	@DisplayName("중복된 수가 있는지 검증")
	void valid_if_there_are_duplicate_number() {
		assertThatThrownBy(() -> BallNumbers.validDuplication(Arrays.asList(4, 8, 8)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}
}