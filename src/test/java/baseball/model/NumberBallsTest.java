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
			.hasMessageContaining("3자릿수가 아닙니다.");

		assertThatThrownBy(() -> {
			NumberBalls numberBalls = new NumberBalls("1654");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("3자릿수가 아닙니다.");
	}


}