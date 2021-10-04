package baseball;


import common.Const;
import nextstep.utils.Randoms;

public class Hitter {
    private Integer[] pitchingArray;

    public void selectPitching() {
        pitchingArray = new Integer[Const.MAX_DIGIT];

        for(int i = 0; i < Const.MAX_DIGIT; i += 1) {
            int randomNum = Randoms.pickNumberInRange(Const.MIN_NUMBER, Const.MAX_NUMBER);
            pitchingArray[i] = randomNum;
        }
    }

    public Integer[] getPitchingArray() {
        return this.pitchingArray;
    }
}
