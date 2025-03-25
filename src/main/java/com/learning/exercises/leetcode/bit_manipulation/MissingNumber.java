package com.learning.exercises.leetcode.bit_manipulation;

public class MissingNumber {

    public int missingNumber(int[] nums) {
//        Input: nums = [3,0,1]
//        Output: 2
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < n + 1; ++i) {
            sum += i;
        }

        for (int num: nums) {
            sum -= num;
        }


        return sum;
    }

}
