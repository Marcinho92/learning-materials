package com.interview.exercises.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOne {

    public static void main(String[] args) {

        assertThat(plusOne(new int[] { 1, 2, 3 })).isEqualTo(new int[] { 1, 2, 4 });
        assertThat(plusOne(new int[] { 4, 3, 2, 1 })).isEqualTo(new int[] { 4, 3, 2, 2 });
        assertThat(plusOne(new int[] { 9 })).isEqualTo(new int[] { 1, 0 });
        assertThat(plusOne(new int[] { 8, 9 ,9 ,9 })).isEqualTo(new int[] { 9, 0, 0, 0 });

    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[n + 1];
        digits[0] = 1;

        return digits;
    }

}