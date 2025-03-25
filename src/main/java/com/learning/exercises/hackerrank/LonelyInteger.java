package com.learning.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LonelyInteger {

    public static void main(String[] args) {

        assertThat(lonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1))).isEqualTo(4);

    }

    public static int lonelyInteger(List<Integer> a) {
        List<Integer> numbers = new ArrayList<>();

        for (Integer num: a) {
            if (numbers.contains(num)) numbers.remove(num);
            else numbers.add(num);
        }

        return numbers.get(0);
    }

}