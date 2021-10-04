package baseball;

import exception.ValidException;
import exception.ValidateError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatorTest {
    @Test
    @DisplayName("자릿수를 판별한다")
    void checkDigit() {
        Validator validator = new Validator();

        assertThat(validator.checkDigit(null)).isTrue();
    }

    @Test
    @DisplayName("유효한 숫자인지를 판별한다")
    void isValidNumber() {
        Validator validator = new Validator();

        assertThat(validator.isValidNumber("22333222")).isTrue();
    }

    @Test
    @DisplayName("중복 숫자가 있는지를 판별한다")
    void isDuplicated() {
        Validator validator = new Validator();

        assertThat(validator.isDuplicated("1234")).isTrue();
    }

    @Test
    @DisplayName("ValidException 처리를 확인합니다")
    void isValid() {
        Validator validator = new Validator();

        assertThatThrownBy(() -> validator.isValid("1"))
                .isInstanceOf(ValidException.class)
                .hasMessageContaining("수의 자릿수가 다릅니다.");

        assertThatThrownBy(() -> validator.isValid("130"))
                .isInstanceOf(ValidException.class)
                .hasMessageContaining("유효하지 않은 숫자입니다.");

        assertThatThrownBy(() -> validator.isValid("122"))
                .isInstanceOf(ValidException.class)
                .hasMessageContaining("중복된 숫자가 존재합니다.");
    }
}
