package baseball.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberBallsTest {

	@Test
	@DisplayName("3자릿수 입력 검증")
	void valid_cipher() {
		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls("8");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(NumberBalls.CIPHER));

		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls("1654");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(NumberBalls.CIPHER));
	}

	@Test
	@DisplayName("입력값이 1~9의 숫자인지 검증")
	void valid_if_number_is_between_one_and_nine() {
		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls(null);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls("024");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls("abc");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}
}