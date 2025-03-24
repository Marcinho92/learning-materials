package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualStacks {

    public static void main(String[] args) {

        assertThat(equalStacks(
                new ArrayList<>(List.of(1, 2, 1, 1)),
                new ArrayList<>(List.of(1, 1, 2)),
                new ArrayList<>(List.of(1, 1)))
        ).isEqualTo(2);

//        assertThat(equalStacks(
//                new ArrayList<>(List.of(3, 2, 1, 1, 1)),
//                new ArrayList<>(List.of(4, 3, 2)),
//                new ArrayList<>(List.of(1, 1, 4, 1)))
//        ).isEqualTo(5);

//        assertThat(equalStacks(
//                new ArrayList<>(List.of(1, 1, 1, 1, 2)),
//                new ArrayList<>(List.of(3, 7)),
//                new ArrayList<>(List.of(1, 3, 1)))
//        ).isEqualTo(0);

    }

    private static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        if (h1.isEmpty() || h2.isEmpty() || h3.isEmpty()) return 0;

        int sum1 = h1.stream().mapToInt(val -> val).sum();
        int sum2 = h2.stream().mapToInt(val -> val).sum();
        int sum3 = h3.stream().mapToInt(val -> val).sum();

        while ((sum1 != sum2 || sum2 != sum3) && (sum1 > 0 && sum2 > 0 && sum3 > 0)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                Integer removed = h1.remove(0);
                sum1 -= removed;
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                Integer removed = h2.remove(0);
                sum2 -= removed;
            } else {
                Integer removed = h3.remove(0);
                sum3 -= removed;
            }
        }

        return Math.min(Math.min(sum1, sum2), sum3);
    }

}