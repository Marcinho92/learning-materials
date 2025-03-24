package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest1_2 {

    public static void main(String[] args) {

        assertThat(countMaxLeftCorner(new ArrayList<>(List.of(
                new ArrayList<>(List.of(112, 42, 83, 119)),
                new ArrayList<>(List.of(56, 125, 56, 49)),
                new ArrayList<>(List.of(15, 78, 101, 43)),
                new ArrayList<>(List.of(62, 98, 114, 108))
        )))).isEqualTo(414);

    }

    public static int countMaxLeftCorner(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;

        for (int i = 0; i < 2 * n; ++i) {
            boolean reverseCol = true;
            for (int j = 0; j < n; ++j) {
                if (matrix.get(2 * n - 1 - j).get(i) < matrix.get(j).get(i)) {
                    reverseCol = false;
                    break;
                }
            }

            if (reverseCol) {
                for (int j = 0; j < n; ++j) {
                    int tmp = matrix.get(2 * n - 1 - j).get(i);
                    matrix.get(2 * n - 1 - j).set(i, matrix.get(j).get(i));
                    matrix.get(j).set(i, tmp);
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            boolean reverseRow = true;
            for (int j = 0; j < n; ++j) {
                if (matrix.get(i).get(2 * n - 1 - j) < matrix.get(i).get(j)) {
                    reverseRow = false;
                    break;
                }
            }

            if (reverseRow) {
                List<Integer> reverseList = new ArrayList<>();
                for (int j = n * 2 - 1; j >= 0; --j) {
                    reverseList.add(matrix.get(i).get(j));
                }
                matrix.set(i, reverseList);
            }
        }

        int countMax = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                countMax += matrix.get(i).get(j);
            }
        }

        return countMax;
    }


}