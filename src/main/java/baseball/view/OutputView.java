package baseball.view;

import baseball.model.Result;

public class OutputView {
	private static String getResultMessage(Result result) {
		if (result.getStrike() == 0 && result.getBall() == 0) {
			return "낫싱";
		}

		return getScoreMessage(result);
	}

	private static String getScoreMessage(Result result) {
		StringBuilder resultBuilder = new StringBuilder();

		resultBuilder.append(getStrikeMessage(result));
		if (resultBuilder.length() > 0) {
			resultBuilder.append(" ");
		}
		resultBuilder.append(getBallMessage(result));

		return resultBuilder.toString();
	}

	private static String getStrikeMessage(Result result) {
		if (result.getStrike() > 0) {
			return result.getStrike() + "스트라이크";
		}

		return "";
	}

	private static String getBallMessage(Result result) {
		if (result.getBall() > 0) {
			return result.getBall() + "볼";
		}

		return "";
	}

	public static void printResult(Result result) {
		System.out.println(getResultMessage(result));
	}

	public static void printComplete() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}
}
