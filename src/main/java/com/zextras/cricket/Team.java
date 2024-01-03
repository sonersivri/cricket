package com.zextras.cricket;

import java.util.HashSet;
import java.util.Set;

public class Team extends ScoreHolder{

    Set<Player> playerSet = new HashSet<>();
    public void addPlayer(Player player) {
        playerSet.add(player);
    }

    public int getTotalScore() {
        int score = 0;
        for (Player player : playerSet) {
            score += player.getTotalScore();
        }
        for (Integer teamScore: scoreMap.values()) {
            score += teamScore;
        }
        return score;
    }
}
