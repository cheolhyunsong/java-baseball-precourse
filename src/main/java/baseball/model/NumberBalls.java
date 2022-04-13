package baseball.model;

import java.util.Objects;

public class NumberBalls {
	public static int CIPHER = 3;
	public static final String NUMBER_REG_EX = "^[1-9]*$";

	public NumberBalls(String pitchingNumber) {
		validNumber(pitchingNumber);
		validCipher(pitchingNumber);
	}

	private void validNumber(String pitchingNumber) {
		if(Objects.isNull(pitchingNumber)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}

		if(!pitchingNumber.matches(NUMBER_REG_EX)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	private void validCipher(String pitchingNumber) {
		if(pitchingNumber.length() != CIPHER) {
			throw new IllegalArgumentException(String.format("유효하지 않은 자릿수입니다(%s 자릿수).", CIPHER));
		}
	}
}
