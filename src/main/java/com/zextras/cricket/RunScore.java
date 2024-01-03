package com.zextras.cricket;

public class RunScore implements PlayerScore {

    private final int score;

    public RunScore(int score){
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getType() {
        return "RunScore";
    }
}
