package baseball.model;

import java.util.Objects;

public class Ball {
	private final String NUMBER_REG_EX = "^[1-9]*$";

	private String number;

	private int number2;
	private int position;

	public Ball(String pitchingNumber) {
		valid(pitchingNumber);
		this.number = pitchingNumber;
	}

	public Ball(int number, int position) {
		this.number2 = number;
		this.position = position;
	}

	private void valid(String pitchingNumber) {
		if(Objects.isNull(pitchingNumber)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}

		if(!pitchingNumber.matches(NUMBER_REG_EX)) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	public BallStatus call(Ball ball) {
		if(this.equals(ball)) {
			return BallStatus.STRIKE;
		}

		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ball ball = (Ball)o;
		return number2 == ball.number2 && position == ball.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number2, position);
	}
}
