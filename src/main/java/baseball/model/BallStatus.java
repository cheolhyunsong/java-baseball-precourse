package baseball.model;

public enum BallStatus {
	NOTHING, BALL, STRIKE;

	public boolean isStrike() {
		return this.equals(STRIKE);
	}

	public boolean isBall() {
		return this.equals(BALL);
	}

	public boolean isNothing() {
		return this.equals(NOTHING);
	}
}
