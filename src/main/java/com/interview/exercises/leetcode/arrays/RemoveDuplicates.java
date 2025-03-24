package com.interview.exercises.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicates {

    public static void main(String[] args) {

        assertThat(removeDuplicates(new int[]{ 1, 1, 2 })).isEqualTo(2);
        assertThat(removeDuplicates(new int[]{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 })).isEqualTo(5);

    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return 1;

        int slow = 0, fast = 1;
        while ( fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                if (fast - slow > 1) {
                    nums[slow + 1] = nums[fast];
                }
                ++slow;
            }
            ++fast;
        }

        return ++slow;
    }

}