package com.zextras.cricket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    private Team team;
    private Player player;

    @BeforeEach
    void beforeEach() {
        team = new Team();
        player = new Player();
        team.addPlayer(player);
    }

    @Test
    void should_totalScore_when_1_run_then_total_run_will_be_1() {
        player.addScore(new RunScore(1));
        Assertions.assertEquals(1, team.getTotalScore());
    }

    @Test
    void should_totalScore_when_0_run_then_total_run_will_be_0() {
        player.addScore(new RunScore(0));
        Assertions.assertEquals(0, team.getTotalScore());
    }

    @Test
    void should_totalScore_be_zero_when_no_score_run_called() {
        Assertions.assertEquals(0, team.getTotalScore());
    }


    @Test
    void should_totalScore_be_3_when_consecutive_call_with_1_and_2() {
        player.addScore(new RunScore(1));
        player.addScore(new RunScore(2));
        Assertions.assertEquals(3, team.getTotalScore());
    }

    @Test
    void should_addTeamScore_returns_1_when_1_team_score_added() {
        Assertions.assertEquals(1,team.addScore(new WicketScore(1)));
    }
}
