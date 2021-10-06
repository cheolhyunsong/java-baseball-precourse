package baseball;

import common.Const;
import exception.ValidException;

public class GameManager {
    Umpire umpire = new Umpire();

    public void startGame() {
        do {
            play();
            OutputView.printComplete();
        } while(isCountinue());
    }

    private void play() {
        Hitter hitter = new Hitter();
        hitter.selectBatting();

        do {
            String pitching = getUsersPitching();

            umpire.calculateScore(hitter.getBattingNumber(), pitching);
            OutputView.printResult(umpire.getScore());

        } while(!umpire.isWin());
    }

    private String getUsersPitching() {
        String pitching;

        do {
            pitching = InputView.printPitchingQustion();
        } while(!validateInputData(pitching));

        return pitching;
    }

    private boolean validateInputData(String pitching) {
        try {
            Validator validator = new Validator();
            validator.validNumber(pitching);

            return true;
        } catch (ValidException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        return false;
    }

    private boolean isCountinue() {
        String answer;

        do {
            answer = InputView.printContinuousQustion();
        } while(!validGameStatusAnswer(answer));

        return Const.START.equals(answer);
    }

    private boolean validGameStatusAnswer(String answer) {
        try {
            Validator validator = new Validator();
            validator.validGameStatusAnswer(answer);

            return true;
        } catch (ValidException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        return false;
    }
}
