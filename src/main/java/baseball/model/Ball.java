package baseball.model;

import java.util.Objects;

public class Ball {
	private final String NUMBER_REG_EX = "^[1-9]*$";

	private String number;

	public Ball(String pitchingNumber) {
		valid(pitchingNumber);
		this.number = pitchingNumber;
	}

	private void valid(String pitchingNumber) {
		if(Objects.isNull(pitchingNumber)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}

		if(!pitchingNumber.matches(NUMBER_REG_EX)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ball ball = (Ball)o;
		return Objects.equals(number, ball.number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(NUMBER_REG_EX, number);
	}
}
