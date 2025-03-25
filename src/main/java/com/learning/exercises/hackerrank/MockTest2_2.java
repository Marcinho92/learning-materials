package com.learning.exercises.hackerrank;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest2_2 {

    public static void main(String[] args) {

        assertThat(getTotalX(List.of(2, 6), List.of(24, 36))).isEqualTo(2);


    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int left = a.get(a.size() - 1);
        int right = b.get(0);

        int counter = 0;
        for (int i = left; i <= right; ++i) {

            boolean aMatch = true;
            for (Integer val: a) {
                if (i % val != 0) {
                    aMatch = false;
                    break;
                }
            }

            boolean bMatch = true;
            for (Integer val: b) {
                if (val % i != 0) {
                    bMatch = false;
                }
            }

            if (aMatch && bMatch) ++counter;
        }

        return counter;
    }



}