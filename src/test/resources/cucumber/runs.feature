Feature: Runs
  Scenario store runs for team
  Given players in the team
  When player score one run
  Then 1 run should be added to the team's score

  Scenario store runs for player
  Given when player 1 score one run
  Then 1 run should be added to the player's score