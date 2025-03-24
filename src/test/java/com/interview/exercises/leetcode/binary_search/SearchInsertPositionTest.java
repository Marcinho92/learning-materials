package com.interview.exercises.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchInsertPositionTest {

    @Test
    public void searchInsertPosition_test() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3}, 2)).isEqualTo(1);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3}, 3)).isEqualTo(1);

    }

}
