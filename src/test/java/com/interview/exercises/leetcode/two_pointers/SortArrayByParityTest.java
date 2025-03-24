package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortArrayByParityTest {

    @Test
    public void sortArrayByParity_test() {

        SortArrayByParity sortArrayByParity = new SortArrayByParity();

        assertThat(sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4})).isEqualTo(new int[]{2, 4, 3, 1});
        assertThat(sortArrayByParity.sortArrayByParity(new int[]{0})).isEqualTo(new int[]{0});
        assertThat(sortArrayByParity.sortArrayByParity(new int[]{0, 2})).isEqualTo(new int[]{0, 2});
        assertThat(sortArrayByParity.sortArrayByParity(new int[]{0, 1})).isEqualTo(new int[]{0, 1});
        assertThat(sortArrayByParity.sortArrayByParity(new int[]{0, 1, 2})).isEqualTo(new int[]{0, 2, 1});

    }

}
