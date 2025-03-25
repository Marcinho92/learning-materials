package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntersectionOfTwoArraysTest {

    @Test
    public void singleThreadedCPU_test() {

        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

        assertThat(intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})).contains(2);
        assertThat(intersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).contains(9, 4);

    }

}