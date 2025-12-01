package com.learning.exercises.leetcode.math_and_geometry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HappyNumberTest {

    @Test
    public void happyNumber_test() {
        HappyNumber happyNumber = new HappyNumber();

        assertThat(happyNumber.isHappy(19)).isTrue();
        assertThat(happyNumber.isHappy(2)).isFalse();
        assertThat(happyNumber.isHappy(1)).isTrue();

    }

}
