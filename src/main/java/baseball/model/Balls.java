package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	private List<Ball> balls = new ArrayList<>();

	public Balls() {
	}

	public Balls(List<Integer> numbers) {
		for(int position = 0; position < numbers.size(); position += 1) {
			balls.add(new Ball(numbers.get(position), position));
		}
	}

	public void add(int pitchingNumber) {
		balls.add(new Ball(pitchingNumber, balls.size()));
	}

	public void clear() {
		balls.clear();
	}

	public int size() {
		return balls.size();
	}

	public BallStatus call(Ball opponentBall) {
		List<BallStatus> statuses = new ArrayList<>();

		for(Ball ball: balls) {
			statuses.add(ball.call(opponentBall));
		}

		return filterBallStatus(statuses);
	}

	private BallStatus filterBallStatus(List<BallStatus> statuses) {
		BallStatus status = BallStatus.NOTHING;

		for(int index = 0; index < statuses.size() && status.isNothing(); index += 1) {
			status = statuses.get(index);
		}

		return status;
	}
}
