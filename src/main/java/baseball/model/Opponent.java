package baseball.model;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;

public class Opponent {
	private Balls balls = new Balls();

	public void selectPitching() {
		Set<Integer> pitchingSet = new LinkedHashSet<>();

		while(pitchingSet.size() < BallNumbers.DIGIT) {
			pitchingSet.add(Randoms.pickNumberInRange(Ball.MIN_NUMBER, Ball.MAX_NUMBER));
		}

		balls.clear();
		for(Integer number : pitchingSet) {
			balls.add(number);
		}
	}

	public Result getScore(List<Ball> playerBalls) {
		Result result = new Result();

		for(Ball ball: playerBalls) {
			BallStatus status = balls.call(ball);

			result.setUp(status);
		}

		return result;
	}

	public int getBallSize() {
		return balls.size();
	}
}
