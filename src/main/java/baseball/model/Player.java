package baseball.model;

import java.util.List;

public class Player {
	private Balls balls = new Balls();

	public void setNumbers(List<Integer> numbers) {
		BallNumbers.validCipher(numbers);
		BallNumbers.validDuplication(numbers);

		balls.clear();
		for(int number: numbers) {
			BallNumbers.validScale(number);
			balls.add(number);
		}
	}

	public List<Ball> getBalls() {
		return balls.getBalls();
	}
}
