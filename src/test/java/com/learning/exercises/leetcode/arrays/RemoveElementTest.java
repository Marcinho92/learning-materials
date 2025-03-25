package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveElementTest {

    @Test
    public void singleThreadedCPU_test() {

        RemoveElement removeElement = new RemoveElement();

        assertThat(removeElement.removeElement(new int[]{3, 2, 2, 3}, 3)).isEqualTo(2);
        assertThat(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)).isEqualTo(5);
        assertThat(removeElement.removeElement(new int[]{4, 5}, 4)).isEqualTo(1);
        assertThat(removeElement.removeElement(new int[]{2, 2, 3}, 2)).isEqualTo(1);

    }

}