package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindPivotIndexTest {

    @Test
    public void singleThreadedCPU_test() {

        FindPivotIndex findPivotIndex = new FindPivotIndex();

        assertThat(findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
        assertThat(findPivotIndex.pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
        assertThat(findPivotIndex.pivotIndex(new int[]{2, 1, -1})).isEqualTo(0);

    }

}