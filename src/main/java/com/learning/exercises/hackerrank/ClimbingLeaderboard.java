package com.learning.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class ClimbingLeaderboard {

    public static void main(String[] args) {

        assertThat(climbingLeaderboard(new ArrayList<>(List.of(100, 90, 90, 80)), List.of(70, 80, 105))).isEqualTo(List.of(4, 3, 1));

    }

    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Unique set sorted according to the natural ordering of its elements
        TreeSet<Integer> rankedSet = new TreeSet<>(ranked);
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer score : player) {
            while(!rankedSet.isEmpty() && score >= rankedSet.first()) {
                rankedSet.pollFirst();
            }
            result.add(rankedSet.size() + 1);
        }
        return result;
    }

}