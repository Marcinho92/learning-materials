package com.interview.exercises.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {

    @Test
    public void baseballGame_test() {

        BaseballGame baseballGame = new BaseballGame();

        assertThat(baseballGame.calPoints(new String[]{"5", "2", "C", "D", "+"})).isEqualTo(30);
        assertThat(baseballGame.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"})).isEqualTo(27);
        assertThat(baseballGame.calPoints(new String[]{"1", "C"})).isEqualTo(0);

    }

}
