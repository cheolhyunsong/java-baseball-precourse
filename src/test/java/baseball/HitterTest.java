package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HitterTest {

    @Test
    @DisplayName("임의의 숫자를 생성한다.")
    void selectPitching() {
        Hitter hitter = new Hitter();
        hitter.selectPitching();
        Integer[] pitchingArr = hitter.getPitchingArray();

        for(Integer pitching: pitchingArr) {
            assertThat(pitching).isBetween(1, 9);
        }
    }
}
