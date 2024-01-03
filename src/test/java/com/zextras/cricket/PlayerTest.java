package com.zextras.cricket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    void should_addPlayerScore_when_1_run_then_total_run_will_be_1() {
        RunScore runScore = new RunScore(1);
        Assertions.assertEquals(1, new Player().addScore(runScore));
    }

    @Test
    void should_addPlayerScore_when_0_run_then_total_run_will_be_0() {
        RunScore runScore = new RunScore(0);
        Assertions.assertEquals(0, new Player().addScore(runScore));
    }

    @Test
    void should_addPlayerScore_be_zero_when_no_score_run_called() {
        Assertions.assertEquals(0, new Player().getTotalScore());
    }


    @Test
    void should_addPlayerScore_be_3_when_consecutive_call_with_1_and_2() {
        Player player = new Player();
        player.addScore(new RunScore(1));
        Assertions.assertEquals(3, player.addScore(new RunScore(2)));
    }
}
