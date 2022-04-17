package baseball.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {
	@Test
	@DisplayName("입력값이 1~9의 숫자인지 검증")
	void valid_if_number_is_between_one_and_nine() {
		assertThatThrownBy(() -> {
			Ball ball = new Ball(0, 1);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");

		assertThatThrownBy(() -> {
			Ball ball = new Ball(10, 2);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}

	@Test
	@DisplayName("스트라이크, 볼, 낫싱 판정")
	void valid_call_when_input_ball() {
		Ball ball = new Ball(2, 3);

		assertThat(ball.call(new Ball(2, 3))).isEqualTo(BallStatus.STRIKE);
		assertThat(ball.call(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
		assertThat(ball.call(new Ball(1, 1))).isEqualTo(BallStatus.NOTHING);
	}
}