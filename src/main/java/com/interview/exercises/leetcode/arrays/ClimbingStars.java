package com.interview.exercises.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ClimbingStars {

    public static void main(String[] args) {

        assertThat(climbStairs(2)).isEqualTo(2);
        assertThat(climbStairs(3)).isEqualTo(3);

    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int n1 = 1, n2 = 2;
        for (int i = 3; i <= n; ++i) {
            int tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
        }

        return n2;
    }

}