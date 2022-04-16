package baseball.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {
	@Test
	@DisplayName("입력값이 1~9의 숫자인지 검증")
	void valid_if_number_is_between_one_and_nine() {
		assertThatThrownBy(() -> {
			Ball ball = new Ball(null);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> {
			Ball ball = new Ball("0");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> {
			Ball ball = new Ball("a");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}

	@Test
	@DisplayName("스트라이크 검증")
	void strike() {
		Ball ball = new Ball(2, 3);
		BallStatus ballStatus = ball.call(new Ball(2, 3));

		assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
	}
}