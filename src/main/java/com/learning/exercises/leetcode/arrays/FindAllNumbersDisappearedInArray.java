package com.learning.exercises.leetcode.arrays;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int val = Math.abs(nums[i]);
            nums[val - 1] = -Math.abs(nums[val - 1]);
        }

        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

}
