package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void singleThreadedCPU_test() {

        ReplaceElementsWithGreatestElementOnRightSide replaceElementsWithGreatestElementOnRightSide = new ReplaceElementsWithGreatestElementOnRightSide();

        assertThat(replaceElementsWithGreatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1})).isEqualTo(new int[]{18, 6, 6, 6, 1, -1});

    }

}