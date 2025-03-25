package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanPlaceFlowersTest {

    @Test
    public void singleThreadedCPU_test() {

        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2)).isFalse();
        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1)).isTrue();
        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1)).isTrue();
        assertThat(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2)).isTrue();

    }

}