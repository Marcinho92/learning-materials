package com.interview.exercises.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BuySellStock {

    public static void main(String[] args) {

        assertThat(maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);

    }

    public static int maxProfit(int[] prices) {
        int max = 0, curMin = Integer.MAX_VALUE;

        for (int price : prices) {
            int curVal = price - curMin;
            if (curVal > max) {
                max = curVal;
            } else if (price < curMin) {
                curMin = price;
            }
        }

        return max;
    }

}