package com.interview.exercises.hackerrank;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubarrayDivision {

    public static void main(String[] args) {

        assertThat(birthday(List.of(2, 2, 1, 3, 2), 4, 2)).isEqualTo(2);

    }

    public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0, tmpSum = 0;

        for (int i = 0; i < m - 1; ++i) {
            tmpSum += s.get(i);
        }

        int pointer = m - 1;
        while (pointer < s.size()) {
            tmpSum += s.get(pointer);

            if (tmpSum == d) ++counter;

            ++pointer;
            tmpSum-= s.get(pointer - m);
        }

        return counter;
    }

}