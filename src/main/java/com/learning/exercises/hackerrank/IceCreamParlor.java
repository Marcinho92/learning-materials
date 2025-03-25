package com.learning.exercises.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class IceCreamParlor {

    public static void main(String[] args) {

        assertThat(iceCreamParlor(6, List.of(1, 3, 4, 5, 6))).isEqualTo(List.of(1, 4));

    }

    private static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); ++i) {
            if (map.containsKey(m - arr.get(i))) {
                return List.of(map.get(m - arr.get(i)) + 1, i + 1);
            } else {
                map.put(arr.get(i), i);
            }
        }

        return List.of(-1);
    }

}