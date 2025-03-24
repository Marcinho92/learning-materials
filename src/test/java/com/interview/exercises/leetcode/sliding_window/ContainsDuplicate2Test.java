package com.interview.exercises.leetcode.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicate2Test {

    @Test
    public void containsDuplicate2_test() {

        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();

        assertThat(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
        assertThat(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isTrue();
        assertThat(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
        assertThat(containsDuplicate2.containsNearbyDuplicate(new int[]{2, 2}, 3)).isTrue();

    }

}
