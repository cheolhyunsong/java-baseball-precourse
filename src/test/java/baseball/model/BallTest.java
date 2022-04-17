package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {
	@Test
	@DisplayName("스트라이크, 볼, 낫싱 판정")
	void valid_call_when_input_ball() {
		Ball ball = new Ball(2, 3);

		assertThat(ball.call(new Ball(2, 3))).isEqualTo(BallStatus.STRIKE);
		assertThat(ball.call(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
		assertThat(ball.call(new Ball(1, 1))).isEqualTo(BallStatus.NOTHING);
	}
}