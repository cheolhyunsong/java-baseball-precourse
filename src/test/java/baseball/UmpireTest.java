package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UmpireTest {
    @Test
    @DisplayName("Strike를 계산하다")
    void getStrike() {
        Umpire umpire = new Umpire();

        umpire.calculateScore("324", "294");

        assertThat(umpire.getScore().getStrike()).as("Strike 개수 : %s", umpire.getScore().getStrike()).isZero();
    }

    @Test
    @DisplayName("Ball를 계산하다")
    void getBall() {
        Umpire umpire = new Umpire();

        umpire.calculateScore("324", "234");

        assertThat(umpire.getScore().getBall()).as("Ball 개수 : %s", umpire.getScore().getBall()).isZero();
    }
}
