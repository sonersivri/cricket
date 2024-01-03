package com.zextras.cricket.model;

public class Player extends ScoreHolder{

    public int getTotalScore() {
        int result = 0;
        for (int scores : scoreMap.values()) {
            result += scores;
        }
        return result;
    }

}
