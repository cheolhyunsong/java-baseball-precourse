package baseball.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallsTest {

	@Test
	@DisplayName("3자릿수 입력 검증")
	void valid_cipher() {
		assertThatThrownBy(() -> {
			Balls numberBalls = new Balls("8");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(Balls.CIPHER));

		assertThatThrownBy(() -> {
			Balls numberBalls = new Balls("1654");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.valueOf(Balls.CIPHER));
	}

	@Test
	@DisplayName("중복된 수가 있는지 검증")
	void valid_if_there_are_duplicate_number() {
		assertThatThrownBy(() -> {
			Balls numberBalls = new Balls("488");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}
}