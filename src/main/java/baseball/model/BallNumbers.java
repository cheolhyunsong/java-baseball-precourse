package baseball.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BallNumbers {
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 9;
	public static final int DIGIT = 3;

	public static void validCipher(List<Integer> balls) {
		if(balls.size() != DIGIT) {
			throw new IllegalArgumentException(String.format("유효하지 않은 자릿수입니다(%s 자릿수).", DIGIT));
		}
	}

	public static void validDuplication(List<Integer> balls) {
		Set<Integer> pitchingSet = new HashSet<>();

		for(int position = 0; position < DIGIT; position += 1) {
			pitchingSet.add(balls.get(position));
		}

		if(pitchingSet.size() != DIGIT) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}

	public static void validScale(int pitchingNumber) {
		if(pitchingNumber < MIN_NUMBER  || MAX_NUMBER < pitchingNumber) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}
}
