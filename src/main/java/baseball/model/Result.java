package baseball.model;

public class Result {
	private int strikeCount = 0;
	private int ballCount = 0;
	private int nothingCount = 0;

	public void setUp(BallStatus status) {
		if(status.isStrike()) {
			strikeCount += 1;
			return;
		}

		if(status.isBall()) {
			ballCount += 1;
			return;
		}

		if(status.isNothing()) {
			nothingCount += 1;
		}
	}

	public boolean isWinPlayer() {
		return strikeCount == BallNumbers.DIGIT;
	}

	public int getStrike() {
		return strikeCount;
	}

	public int getBall() {
		return ballCount;
	}
}
