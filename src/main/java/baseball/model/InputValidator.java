package baseball.model;

import java.util.Objects;

public class InputValidator {
	private static final String NUMBER_REG_EX = "^[0-9]*$";
	public static final String CONTINUE_GAME = "1";
	public static final String END_GAME = "2";

	public static void valid(String pitchingNumber) {
		if(Objects.isNull(pitchingNumber)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}

		if(!pitchingNumber.matches(NUMBER_REG_EX)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	public static void validContinueAnswer(String answer) {
		if(!(CONTINUE_GAME.equals(answer) || END_GAME.equals(answer))) {
			System.out.println("!@!@!@");
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}
}
