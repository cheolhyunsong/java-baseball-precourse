package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallsTest {
	private Balls balls;

	@BeforeEach
	public void init() {
		balls = new Balls(Arrays.asList(1, 3, 5));
	}

	@Test
	@DisplayName("스트라이크, 볼, 낫싱 판정")
	public void call() {
		assertThat(balls.call(new Ball(3, 1))).isEqualTo(BallStatus.STRIKE);
		assertThat(balls.call(new Ball(1, 2))).isEqualTo(BallStatus.BALL);
		assertThat(balls.call(new Ball(4, 2))).isEqualTo(BallStatus.NOTHING);
	}
}