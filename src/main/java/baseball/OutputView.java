package baseball;

public class OutputView {

    private static String getScoreMessage(Score score) {
        String resultMessage = "";

        if (score.getStrike() == 0 && score.getBall() == 0) {
           return "낫싱";
        }

        if (score.getStrike() > 0) {
            resultMessage = String.format("%d스트라이크", score.getStrike());
        }

        if (resultMessage.length() > 0) {
            resultMessage += " ";
        }

        if (score.getBall() > 0) {
            resultMessage += String.format("%d볼", score.getBall());
        }

        return resultMessage;
    }

    public static void printResult(Score score) {
        String resultMessage = getScoreMessage(score);

        System.out.println(resultMessage);
    }

    public static void getComplate() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
    }
}
