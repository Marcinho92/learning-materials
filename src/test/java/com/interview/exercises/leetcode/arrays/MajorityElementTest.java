package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MajorityElementTest {

    @Test
    public void singleThreadedCPU_test() {

        MajorityElement majorityElement = new MajorityElement();

        assertThat(majorityElement.majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
        assertThat(majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);

    }

}