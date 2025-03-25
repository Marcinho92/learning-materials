package com.learning.exercises.leetcode.binary_search;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
//        Input: num = 16
//        Output: true
//        Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

        if (num == 1) {
            return true;
        }

        int left = 1, right = num / 2;
        int middle;
        while (left < right) {
            middle = left + (right - left) / 2;
            long curSquare = (long) middle * middle;
            if (curSquare == num) {
                return true;
            } else if (curSquare > num) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return left * left == num;
    }

}
