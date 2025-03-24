package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfGoodPairsTest {

    @Test
    public void singleThreadedCPU_test() {

        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

        assertThat(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})).isEqualTo(4);
        assertThat(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1})).isEqualTo(6);
        assertThat(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3})).isEqualTo(0);

    }

}