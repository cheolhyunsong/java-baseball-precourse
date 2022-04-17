package baseball.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
	public static int DIGIT = 3;

	private List<Ball> balls = new ArrayList<>();

	public Balls(List<Integer> balls) {
		validCipher(balls);
		setBalls(balls);
	}

	private void validCipher(List<Integer> balls) {
		if(balls.size() != DIGIT) {
			throw new IllegalArgumentException(String.format("유효하지 않은 자릿수입니다(%s 자릿수).", DIGIT));
		}
	}

	private void setBalls(List<Integer> numbers) {
		Set<Integer> pitchingSet = new HashSet<>();

		for(int position = 0; position < DIGIT; position += 1) {
			int ballNumber = numbers.get(position);
			pitchingSet.add(ballNumber);
			balls.add(new Ball(ballNumber, position));
		}

		validDuplication(pitchingSet);
	}

	private void validDuplication(Set<Integer> pitchingSet) {
		if(pitchingSet.size() != DIGIT) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}
}
