package com.zextras.cricket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class Stepdefs {
    private Player player;
    private Team team;

    @Given("players in the team")
    public void given_players_in_the_team() {
        player = new Player();
        team = new Team();
        team.addPlayer(player);
    }

    @When("player score one run")
    public void when_player_1_score_one_run() {
//       player.scoreRun(1);
    }

    @Then("1 run should be added to the team's score")
    public void then_1_run_should_be_added_to_the_teams_score() {
        Assertions.assertEquals(1, team.getTotalScore());
    }

    @Given("when player {int} score one run")
    public void whenPlayerScoreOneRun(int arg0) {
        
    }

    @Then("{int} run should be added to the player's score")
    public void runShouldBeAddedToThePlayerSScore(int arg0) {
    }
}
