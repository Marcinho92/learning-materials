package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumProductDifferenceBetweenTwoPairsTest {

    @Test
    public void singleThreadedCPU_test() {

        MaximumProductDifferenceBetweenTwoPairs maximumProductDifferenceBetweenTwoPairs = new MaximumProductDifferenceBetweenTwoPairs();

        assertThat(maximumProductDifferenceBetweenTwoPairs.maxProductDifference(new int[]{5, 6, 2, 7, 4})).isEqualTo(34);
        assertThat(maximumProductDifferenceBetweenTwoPairs.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);

    }

}