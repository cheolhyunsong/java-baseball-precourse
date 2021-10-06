package baseball;

public class OutputView {

    private static String getResultMessage(Score score) {
        if (score.getStrike() == 0 && score.getBall() == 0) {
           return "낫싱";
        }

        return getScoreMessage(score);
    }

    private static String getScoreMessage(Score score) {
        StringBuilder resultBuilder = new StringBuilder();

        resultBuilder.append(getStrikeMessage(score));
        if (resultBuilder.length() > 0) {
            resultBuilder.append(" ");
        }
        resultBuilder.append(getBallMessage(score));

        return resultBuilder.toString();
    }

    private static String getStrikeMessage(Score score) {
        if (score.getStrike() > 0) {
            return score.getStrike() + "스트라이크";
        }

        return "";
    }

    private static String getBallMessage(Score score) {
        if (score.getBall() > 0) {
            return score.getBall() + "볼";
        }

        return "";
    }

    public static void printResult(Score score) {
        System.out.println(getResultMessage(score));
    }

    public static void printComplete() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
    }
}
