package com.learning.exercises.leetcode.two_pointers;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
//        Input: nums = [3,1,2,4]
//        Output: [2,4,3,1]
//        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

        int n = nums.length;
        if (n == 1) {
            return nums;
        }

        int odd = 0, even = 0;
        while (even < n) {
            while (even < n && nums[even] % 2 != 0) {
                ++even;
            }
            while (odd < n && nums[odd] % 2 == 0) {
                ++odd;
            }
            if (odd < even && even < n) {
                int tmp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = tmp;
            } else if (even == n) {
                break;
            } else  {
                even = odd + 1;
            }
        }

        return nums;
    }

}
