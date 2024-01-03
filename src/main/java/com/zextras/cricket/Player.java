package com.zextras.cricket;

import java.util.HashMap;
import java.util.Map;

public class Player extends ScoreHolder{

    public int getTotalScore() {
        int result = 0;
        for (int scores : scoreMap.values()) {
            result += scores;
        }
        return result;
    }

}
