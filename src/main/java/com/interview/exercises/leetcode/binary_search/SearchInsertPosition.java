package com.interview.exercises.leetcode.binary_search;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

        int n = nums.length;
        int left = 0, right = n - 1;
        int middle = left + (right - left) / 2;
        while (left < right) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }

        return nums[middle] >= target ? middle : middle + 1;

    }

}
