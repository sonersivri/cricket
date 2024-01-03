package com.zextras.cricket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunScoreTest {
    @Test
    void should_getType_RunScore() {
        Assertions.assertEquals("RunScore", new RunScore(10).getType());
    }

    @Test
    void should_getScore_10_when_initialized_with_10() {
        Assertions.assertEquals(10, new RunScore(10).getScore());
    }
}
