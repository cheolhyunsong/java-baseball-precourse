package baseball;


import common.Const;
import nextstep.utils.Randoms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hitter {
    private String battingNumbers;

    public void selectBatting() {
        battingNumbers = "";
        Set<String> battingSet = new LinkedHashSet<>();
        StringBuilder battingBuilder = new StringBuilder();

        while(battingSet.size() < Const.MAX_DIGIT) {
            battingSet.add(String.valueOf(Randoms.pickNumberInRange(Const.MIN_NUMBER, Const.MAX_NUMBER)));
        }

        for (String batting : battingSet) {
            battingBuilder.append(batting);
        }

        battingNumbers = battingBuilder.toString();
    }

    public String getBattingNumber() {
        return battingNumbers;
    }
}
