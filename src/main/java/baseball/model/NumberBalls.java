package baseball.model;

public class NumberBalls {
	public static int CIPHER = 3;

	public NumberBalls(String pitchingNumber) {
		validCipher(pitchingNumber);
	}

	private void validCipher(String pitchingNumber) {
		if(pitchingNumber.length() != CIPHER) {
			throw new IllegalArgumentException(String.format("유효하지 않은 자릿수입니다(%s 자릿수).", CIPHER));
		}
	}
}
