package com.learning.exercises.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

public class SumVsXor {

    public static void main(String[] args) {

//        assertThat(sumXor(4)).isEqualTo(4);
        assertThat(sumXor(1000000000000000L)).isEqualTo(1073741824L);

    }

    private static long sumXor(long n) {
        if (n == 0) return 1;

        long counter = 0;

        long sum = n;
        for (int i = 0; i < n; ++i) {
            if (sum == (n ^ i)) {
                ++counter;
            }
            ++sum;
        }

        return counter;
    }

}