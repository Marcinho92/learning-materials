package com.learning.exercises.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

public class DrawingBooks {

    public static void main(String[] args) {

        assertThat(pageCount(6, 5)).isEqualTo(1);

    }

    private static int pageCount(int n, int p) {
        int min = Math.min(p / 2, (n - p) / 2);
        if (n % 2 == 0 && (n - p) < p) {
            return (int)Math.ceil((n - p) / 2.);
        }
        return min;
    }

}