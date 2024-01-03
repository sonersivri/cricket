package com.zextras.cricket.model;

public class WicketScore implements TeamScore {

    private int score;

    public WicketScore(int score) {
        this.score = score;
    }
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getType() {
        return "WicketScore";
    }
}
