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
        - feature: Runs
            - scenerio: store runs for team
              given: when player 1 score one run
              then: 1 run should be added to the team's score
              
            - scenerio: store runs for player
              given: when player 1 score one run
              then: 1 run should be added to the player's score

        - feature: Strike
            - scenerio: switching the strike
              given: when player 1 score one run
              then: player 2 takes the strike
              
        - feature: Balls
            - scenerio: reduce remaing balls in current over
              given: when bowler deliver's a ball
              then: remaining balls in current over should reduce by one
              
            - scenerio: 
              given: when bowler deliver's a ball
              then: remaining balls in current over should reduce by one

      - feature: Wickets
          - scenerio: update wicket count
            when: bowler takes a wicket
            then: the current wickets count gets reduced by one
                      
    - follow TDD
