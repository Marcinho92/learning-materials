package com.learning.exercises.leetcode.two_pointers;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = n; i >= 0; --i) {
            for (int j = 0; j < i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }

}