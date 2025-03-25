package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleElementInSortedArrayTest {

    @Test
    public void singleElementInSortedArray_tet() {

        SingleElementInSortedArray singleElementInSortedArray = new SingleElementInSortedArray();

//        assertThat(singleElementInSortedArray.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8})).isEqualTo(2);
//        assertThat(singleElementInSortedArray.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11})).isEqualTo(10);
        assertThat(singleElementInSortedArray.singleNonDuplicate(new int[]{1,1,2,3,3})).isEqualTo(2);

    }

}
