package baseball;

public class Score {
    private Integer strike;
    private Integer ball;

    public Score() {
        this.strike = 0;
        this.ball = 0;
    }

    public Score(Integer strike, Integer ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void addStrike() {
        this.strike += 1;
    }

    public Integer getStrike() {
        return this.strike;
    }

    public void addBall() {
        this.ball += 1;
    }

    public Integer getBall() {
        return this.ball;
    }
}
