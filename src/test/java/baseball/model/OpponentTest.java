package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OpponentTest {
	@Test
	@DisplayName("n자리 난수 생성")
	public void create_three_digit_random_numbers() {
		Opponent opponent = new Opponent();
		opponent.selectPitching();

		assertThat(opponent.getBallSize()).isEqualTo(Ruler.DIGIT);
	}
}