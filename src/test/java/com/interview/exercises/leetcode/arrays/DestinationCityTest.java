package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DestinationCityTest {

    @Test
    public void singleThreadedCPU_test() {

        DestinationCity destinationCity = new DestinationCity();

        assertThat(destinationCity.destCity(List.of(List.of("London", "New York"), List.of("New York", "Lima"), List.of("Lima", "Sao Paulo")))).isEqualTo("Sao Paulo");
        assertThat(destinationCity.destCity(List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A")))).isEqualTo("A");

    }

}