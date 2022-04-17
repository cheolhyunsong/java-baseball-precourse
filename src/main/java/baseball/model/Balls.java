package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	public static int DIGIT = 3;

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
}
