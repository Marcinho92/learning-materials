package com.learning.exercises.leetcode.binary_search;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
//        Input: n = 5
//        Output: 2
//        Explanation: Because the 3rd row is incomplete, we return 2.

        if (n < 2) return n;
        if (n == 2) return 1;

        int left = 1, right = n;
        int middle = 0;
        double curr;
        while (left < right) {
            middle = left + (right - left) / 2;
            curr = middle / 2. * (middle + 1);
            if (curr < n) {
                left = middle + 1;
            } else if (curr > n) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return right / 2. * (right + 1) <= n ? right : right - 1;
    }

}
