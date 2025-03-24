package com.interview.exercises.hackerrank;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BalancedSums {

    public static void main(String[] args) {

        assertThat(balancedSums(List.of(1, 2, 3))).isEqualTo("NO");
        assertThat(balancedSums(List.of(1, 2, 3, 3))).isEqualTo("YES");
        assertThat(balancedSums(List.of(1))).isEqualTo("YES");

    }

    private static String balancedSums(List<Integer> arr) {
        if (arr.size() == 1) return "YES";

        int totalSum = 0;
        for (Integer val: arr) {
            totalSum += val;
        }

        int pointer = 0;
        int leftSum = 0, rightSum = totalSum - arr.get(pointer);
        while (pointer < arr.size() - 1) {
            if (leftSum == rightSum) {
                return "YES";
            }

            leftSum += arr.get(pointer);
            ++pointer;
            rightSum -= arr.get(pointer);
        }

        return "NO";
    }

}