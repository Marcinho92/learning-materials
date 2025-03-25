package com.learning.exercises.leetcode.two_pointers;

import java.util.Arrays;

public class MinDiffBetweenHighestAndLowestOfKScores {

    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if (k < 2 || n < 2) {
            return 0;
        }

        Arrays.sort(nums);

        if (k > n) {
            return nums[n - 1] - nums[0];
        }

        int minDif = Integer.MAX_VALUE;
        int left = 0, right = k - 1;
        while (right < n) {
            int curDif = nums[right] - nums[left];
            if (curDif < minDif) {
                minDif = curDif;
            }
            ++left;
            ++right;
        }

        return minDif;
    }

}
