package com.learning.exercises.hackerrank;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DiagonalDifference {

    public static void main(String[] args) {

        assertThat(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9)))).isEqualTo(2);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();

        int sumLeftToRight = 0, sumRightToLeft = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j) sumLeftToRight += arr.get(i).get(j);
                if (i == n - 1 - j) sumRightToLeft += arr.get(i).get(j);
            }
        }

        return Math.abs(sumLeftToRight - sumRightToLeft);
    }

}