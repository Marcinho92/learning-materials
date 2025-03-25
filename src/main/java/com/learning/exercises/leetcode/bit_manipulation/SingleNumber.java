package com.learning.exercises.leetcode.bit_manipulation;

public class SingleNumber {

    public int singleNumber(int[] nums) {
//        Input: nums = [2,2,1]
//        Output: 1

        int val = 0;
        for (int num: nums) {
            val = val ^ num;
        }

        return val;
    }

}
