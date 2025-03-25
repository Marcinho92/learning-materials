package com.learning.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SparseArrays {

    public static void main(String[] args) {

        assertThat(matchingStrings(List.of("ab", "ab", "abc"), List.of("ab", "abc", "bc"))).isEqualTo(List.of(2, 1, 0));

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> queriesCounter = new ArrayList<>();

        queries.forEach(query -> {
            int queryCounter = (int)strings.stream()
                    .filter(string -> string.equals(query))
                    .count();
            queriesCounter.add(queryCounter);
        });

        return queriesCounter;
    }

}