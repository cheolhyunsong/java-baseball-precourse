package baseball;

import nextstep.utils.Console;

public class InputView {
    public static String printPitchingQustion() {
        System.out.print("숫자를 입력해주세요 : ");

        return Console.readLine();
    }

    public static String printContinuousQustion() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return Console.readLine();
    }
}
