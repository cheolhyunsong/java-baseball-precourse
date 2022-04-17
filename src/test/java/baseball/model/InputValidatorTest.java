package baseball.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputValidatorTest {
	@Test
	@DisplayName("숫자만 입력했는지 검증")
	void valid_number() {
		assertThatThrownBy(() -> InputValidator.valid("abc"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("입력값이 올바르지 않습니다.");
	}
}