package com.interview.exercises.leetcode.arrays;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
//        Input: nums = [1,7,3,6,5,6]
//        Output: 3
//        Explanation:
//        The pivot index is 3.
//        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//        Right sum = nums[4] + nums[5] = 5 + 6 = 11

        int n = nums.length;
        if (n == 1) return 0;

        int sumRight = 0, sumLeft = 0;
        for (int i = 0; i < n; ++i) {
            sumRight += nums[i];
        }

        for (int i = 0; i < n; ++i) {
            sumRight -= nums[i];
            if (sumLeft == sumRight) return i;
            sumLeft += nums[i];
        }

        return -1;
    }

}
