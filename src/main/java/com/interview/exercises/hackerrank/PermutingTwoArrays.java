package com.interview.exercises.hackerrank;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PermutingTwoArrays {

    public static void main(String[] args) {

        assertThat(twoArrays(5, List.of(2, 3, 1, 1, 1), List.of(1, 3, 4, 3, 3))).isEqualTo("NO");
        assertThat(twoArrays(9, List.of(1, 5, 1, 4, 4, 2, 7, 1, 2, 2), List.of(8, 7, 1, 7, 7, 4, 4, 3, 6, 7))).isEqualTo("NO");
        assertThat(twoArrays(9, List.of(3, 6, 8, 5, 9, 9, 4, 8, 4, 7), List.of(5, 1, 0, 1, 6, 4, 1, 7, 4, 3))).isEqualTo("YES");

    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        List<Integer> sortedA = A.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedB = B.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int n = A.size();

        for (int i = 0; i < n; ++i) {
            if (sortedA.get(i) + sortedB.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }

}