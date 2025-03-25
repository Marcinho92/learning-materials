package com.learning.exercises.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SalesByMatch {

    public static void main(String[] args) {

        assertThat(sockMerchant(7, List.of(1, 2, 1, 2, 1, 3, 2))).isEqualTo(2);

    }

    private static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Long> groupedSocks = ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return groupedSocks.values().stream()
                .map(val -> val / 2)
                .mapToInt(Math::toIntExact)
                .sum();
    }

}