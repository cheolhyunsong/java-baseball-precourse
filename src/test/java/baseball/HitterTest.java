package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HitterTest {

    @Test
    @DisplayName("임의의 숫자를 생성한다.")
    void selectPitching() {
        Hitter hitter = new Hitter();
        hitter.selectBatting();
        String pitchingNumber = hitter.getBattingNumber();

        for(int i = 0; i < pitchingNumber.length(); i += 1) {
            assertThat(pitchingNumber).isBetween("111", "999");
        }

    }
}
