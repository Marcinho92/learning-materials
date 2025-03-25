package com.learning.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicArray {

    public static void main(String[] args) {

        assertThat(dynamicArray(2, List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
        ))).isEqualTo(List.of(7, 3));

    }

    private static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        List<Integer> results = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>(n);

        for (int i = 0; i < n; ++i) {
            arr.add(new ArrayList<>());
        }


        for (List<Integer> query : queries) {
            Integer cmd = query.get(0);
            Integer x = query.get(1);
            Integer y = query.get(2);
            int idx = (x ^ lastAnswer) % 2;

            if (cmd == 1) {
                arr.get(idx).add(y);
            } else if (cmd == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                results.add(lastAnswer);
                System.out.println(lastAnswer);
            }
        }

        return results;
    }

}