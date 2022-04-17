package baseball.controller;

import java.util.ArrayList;
import java.util.List;

import baseball.model.InputValidator;
import baseball.model.Opponent;
import baseball.model.Player;
import baseball.model.Result;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameMachine {
	private final Opponent opponent;
	private final Player player;

	public GameMachine() {
		opponent = new Opponent();
		player = new Player();
	}

	public void start() {
		do {
			opponent.selectPitching();
			playing();
		} while(isPlayingGame());
	}

	private void settingPlayerNumber(String pitchingNumbers) {
		List<Integer> numbers = new ArrayList<>();
		for(char charNumber: pitchingNumbers.toCharArray()) {
			int number = Integer.parseInt(Character.toString(charNumber));

			numbers.add(number);
		}
		player.setNumbers(numbers);
	}

	private void playing() {
		Result score;

		do {
			String pitchingNumbers = InputView.printPitchingQuestion();
			InputValidator.valid(pitchingNumbers);

			settingPlayerNumber(pitchingNumbers);

			score = opponent.getScore(player.getBalls());
			OutputView.printResult(score);
		}while(isNextTurn(score));
	}

	private boolean isNextTurn(Result result) {
		if(result.isWinPlayer()) {
			OutputView.printComplete();
			return false;
		}

		return true;
	}

	private boolean isPlayingGame() {
		String answer = InputView.printContinuousQuestion();
		InputValidator.validContinueAnswer(answer);

		return InputValidator.CONTINUE_GAME.equals(answer);
	}
}
