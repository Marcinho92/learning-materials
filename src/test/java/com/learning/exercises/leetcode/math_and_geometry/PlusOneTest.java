package com.learning.exercises.leetcode.math_and_geometry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOneTest {

    @Test
    public void happyNumber_test() {
        PlusOne plusOne = new PlusOne();

        assertThat(plusOne.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        assertThat(plusOne.plusOne(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2, 2});
        assertThat(plusOne.plusOne(new int[]{9})).isEqualTo(new int[]{1, 0});
        assertThat(plusOne.plusOne(new int[]{8, 9, 9, 9})).isEqualTo(new int[]{9, 0, 0, 0});
    }

}
