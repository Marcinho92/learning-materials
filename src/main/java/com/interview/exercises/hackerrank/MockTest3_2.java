package com.interview.exercises.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest3_2 {

    public static void main(String[] args) {

        assertThat(pairs(1, List.of(1, 2, 3, 4))).isEqualTo(3);

    }

    public static int pairs(int k, List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer val: arr) {
            map.put(val, val - k);
        }

        return (int)map.values().stream()
                .filter(map::containsKey)
                .count();
    }

}