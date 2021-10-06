package baseball;

import common.Const;

public class Umpire {

    private Score score;

    private void addStrike(int index, int position) {
        if(index == position) {
            score.addStrike();
        }
    }

    private void addBall(int index, int position) {
        if(index != -1 && index != position) {
            score.addBall();
        }
    }

    private int findNumber(String pitchingNumber, char pitching) {
        return pitchingNumber.indexOf(pitching);
    }

    public void calculateScore(String pitchingNum, String selectedPitching) {
        score = new Score();

        for(int position = 0; position < Const.MAX_DIGIT; position += 1) {
            int idx = findNumber(pitchingNum, selectedPitching.charAt(position));

            addStrike(idx, position);
            addBall(idx, position);
        }
    }

    public Score getScore() {
        return score;
    }

    public boolean isWin() {
        return score.getStrike() == Const.MAX_DIGIT;
    }
}
