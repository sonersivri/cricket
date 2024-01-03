package com.zextras.cricket.model;

import java.util.HashSet;
import java.util.Set;

public class Team extends ScoreHolder {
    private String name;

    Set<Player> playerSet = new HashSet<>();

    public Team() {
    }

    public Team(final String name) {
        this.name = name;
    }

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

    public String getName() {
        return name;
    }
}
