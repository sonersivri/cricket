# cricket
Cricket score board

- [x] github repo

- [x] project requirements
    
  - [x] take some sample/idea from internet
        
        - match fixture - add teams (A, B), players etc
        
        - team A Bats first and score boards shows the score
        
        - simple score board that shows current score
          
          - teams who are playing against each other
          
          - runs/wickets (current over/total overs)
- decide way to program/work
    - follow BDD
 ```
Feature: Runs
    Scenerio store runs for team
        Given when player 1 score one run
        Then 1 run should be added to the team's score
      
Scenerio: store runs for player
    Given when player 1 score one run
    Then 1 run should be added to the player's score

Feature: Strike
    Scenerio switching the strike
    Given when player 1 score one run
    Then player 2 takes the strike
      
Feature: Balls
    Scenerio reduce remaing balls in current over
    Given when bowler deliver's a ball
    Then remaining balls in current over should reduce by one
      
Scenerio: 
    Given when bowler deliver's a ball
    Then remaining balls in current over should reduce by one

Feature: Wickets
    Scenerio update wicket count
    When bowler takes a wicket
    Then the current wickets count gets reduced by one

```
                      
    - follow TDD
