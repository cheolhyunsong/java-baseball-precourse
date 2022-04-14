package baseball.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Balls {
	public static int CIPHER = 3;

	private Set<Ball> pitchingSet = new LinkedHashSet<>();

	public Balls(String pitchingNumber) {
		validCipher(pitchingNumber);

		for(char charNumber : pitchingNumber.toCharArray()) {
			pitchingSet.add(new Ball(Character.toString(charNumber)));
		}

		validDuplication();
	}

	private void validCipher(String pitchingNumber) {
		if(pitchingNumber.length() != CIPHER) {
			throw new IllegalArgumentException(String.format("유효하지 않은 자릿수입니다(%s 자릿수).", CIPHER));
		}
	}

	private void validDuplication() {
		if(pitchingSet.size() != CIPHER) {
			throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
		}
	}
}
