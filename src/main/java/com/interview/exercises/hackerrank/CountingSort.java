package com.interview.exercises.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingSort {

    public static void main(String[] args) {

        assertThat(countingSort(List.of(1, 1, 3, 2, 1))).isEqualTo(List.of(0, 3, 1, 1));

    }

    public static List<Integer> countingSort(List<Integer> arr) {
//        Integer[] array = new Integer[100];
//        Arrays.fill(array, 0);

        Map<Integer, Integer> countedNumbers = new HashMap<>(100);
        for (int i = 0; i < 100; ++i) {
            countedNumbers.put(i, 0);
        }

        arr.forEach(num -> {
            countedNumbers.put(num, countedNumbers.get(num) + 1);

        });

//        return Arrays.asList(array);
        return countedNumbers.values().stream().collect(Collectors.toList());
    }

}