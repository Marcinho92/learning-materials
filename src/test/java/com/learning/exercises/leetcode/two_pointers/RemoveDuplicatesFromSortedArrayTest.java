package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates_test() {

        RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

        assertThat(removeDuplicates.removeDuplicates(new int[]{1, 1, 2}))
                .isEqualTo(2);
        assertThat(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}))
                .isEqualTo(5);

    }

}
