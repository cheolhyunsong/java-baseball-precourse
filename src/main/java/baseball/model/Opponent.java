package baseball.model;

import java.util.LinkedHashSet;
import java.util.Set;

import nextstep.utils.Randoms;

public class Opponent {
	private Balls balls = new Balls();

	public void selectPitching() {
		Set<Integer> pitchingSet = new LinkedHashSet<>();

		while(pitchingSet.size() < Ruler.DIGIT) {
			pitchingSet.add(Randoms.pickNumberInRange(Ruler.MIN_NUMBER, Ruler.MAX_NUMBER));
		}

		balls.clear();
		for(Integer number : pitchingSet) {
			balls.add(number);
		}
	}

	public int getBallSize() {
		return balls.size();
	}
}
