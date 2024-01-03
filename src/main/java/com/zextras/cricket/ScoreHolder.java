package com.zextras.cricket;

import java.util.HashMap;
import java.util.Map;

public abstract class ScoreHolder {

    protected Map<String, Integer> scoreMap = new HashMap<>();

    public int addScore(Score score) {
        String type = score.getType();
        Integer currentScore = scoreMap.get(type);
        int result;
        if (currentScore == null) {
            result = score.getScore();
            scoreMap.put(type, result);
        } else {
            result = currentScore + score.getScore();
            scoreMap.put(type, result);
        }
        return result;

    }
}
