package com.interview.exercises.leetcode.arrays;

public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1, middle = left + (right - left) / 2;

        while (middle > left) {
            if (nums[middle] != nums[middle - 1] && nums[middle] != nums[middle + 1]) {
                return nums[middle];
            }
            if (middle % 2 == 0) {
                if (nums[middle] == nums[middle + 1]) {
                    left = middle + 2;
                } else {
                    right = middle - 2;
                }
            } else {
                if (nums[middle] == nums[middle - 1]) {
                    left = middle + 1;
                } else {
                    right = middle - 2;
                }
            }
            middle = left + (right - left) / 2;
        }

        return nums[middle];
    }

}
