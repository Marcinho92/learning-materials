package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeTheStringGreatTest {

    @Test
    public void makeTheStringGreat_test() {

        MakeTheStringGreat makeTheStringGreat = new MakeTheStringGreat();

        assertThat(makeTheStringGreat.makeGood("leEeetcode")).isEqualTo("leetcode");
        assertThat(makeTheStringGreat.makeGood("abBAcC")).isEqualTo("");

    }

}
