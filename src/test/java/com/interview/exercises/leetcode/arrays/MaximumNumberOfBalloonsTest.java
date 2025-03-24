package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void singleThreadedCPU_test() {

        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();

        assertThat(maximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko")).isEqualTo(1);
        assertThat(maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon")).isEqualTo(2);

    }

}