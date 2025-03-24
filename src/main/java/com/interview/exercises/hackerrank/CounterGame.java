package com.interview.exercises.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterGame {

    public static void main(String[] args) {

        assertThat(counterGame(132)).isEqualTo("Louise");
        assertThat(counterGame(6)).isEqualTo("Richard");

    }

    private static String counterGame(long n) {
        int reductions = 0;

        while (n > 1) {

            long highestPow2 = 1;
            while (highestPow2 < n) {
                if (n == highestPow2 * 2L) {
                    n = n / 2;
                    ++reductions;
                } else if ( n < highestPow2 * 2L) {
                    n = n - highestPow2;
                    ++reductions;
                } else {
                    highestPow2 = highestPow2 * 2;
                }
            }
        }

        return reductions % 2 == 0 ? "Richard" : "Louise";
    }

}