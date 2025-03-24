package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxMin {

    public static void main(String[] args) {

        assertThat(maxMin(2, new ArrayList<>(List.of(1, 4, 7, 2)))).isEqualTo(1);

    }

    private static int maxMin(int k, List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());

        int n = arr.size();
        int min = Integer.MAX_VALUE;
        int left = 0, right = k - 1;

        while (right < n) {
            int diff = arr.get(right) - arr.get(left);
            if (diff < min) min = diff;
            ++left;
            ++right;
        }

        return min;
    }

}