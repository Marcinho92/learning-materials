package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NextGreaterElement1Test {

    @Test
    public void singleThreadedCPU_test() {

        NextGreaterElement1 nextGreaterElement1 = new NextGreaterElement1();

        assertThat(nextGreaterElement1.nextGreaterElement(new int[]{4, 1, 2}, new int[]{2, 1, 3, 4})).isEqualTo(new int[]{-1, 3, 3});
        assertThat(nextGreaterElement1.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})).isEqualTo(new int[]{-1, 3, -1});
        assertThat(nextGreaterElement1.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})).isEqualTo(new int[]{3, -1});

    }

}