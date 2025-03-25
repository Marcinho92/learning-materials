package com.learning.exercises.hackerrank;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest3_1 {

    public static void main(String[] args) {

        assertThat(truckTour(List.of(
                List.of(1, 5),
                List.of(10, 3),
                List.of(3, 4)
        ))).isEqualTo(1);


    }

    public static int truckTour(List<List<Integer>> petrolpumps) {
        if (petrolpumps.size() < 2) return 0;

        int min = 0;
        int capacity = 0;

        for (int i = 0; i < petrolpumps.size(); ++i) {
            List<Integer> curPump = petrolpumps.get(i);

            capacity += curPump.get(0);
            if (capacity < curPump.get(1)) {
                min = i + 1;
                capacity = 0;
            } else {
                capacity -= curPump.get(1);
            }
        }

        return min;
    }



}