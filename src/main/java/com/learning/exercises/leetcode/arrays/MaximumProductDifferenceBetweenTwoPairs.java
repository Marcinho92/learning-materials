package com.learning.exercises.leetcode.arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {
//        Input: nums = [5,6,2,7,4]
//        Output: 34
//        Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
//                The product difference is (6 * 7) - (2 * 4) = 34.

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return max1 * max2 - min1 * min2;
    }

}
