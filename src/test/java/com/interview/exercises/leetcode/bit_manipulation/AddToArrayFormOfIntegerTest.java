package com.interview.exercises.leetcode.bit_manipulation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddToArrayFormOfIntegerTest {

    @Test
    public void addToArrayFormOfInteger_test() {

        AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

        assertThat(addToArrayFormOfInteger.addToArrayForm(new int[]{1, 2, 0, 0}, 34)).isEqualTo(List.of(1, 2, 3, 4));
        assertThat(addToArrayFormOfInteger.addToArrayForm(new int[]{1, 2, 3, 4}, 181)).isEqualTo(List.of(4, 5, 5));
        assertThat(addToArrayFormOfInteger.addToArrayForm(new int[]{2, 1, 5}, 806)).isEqualTo(List.of(1, 0, 2, 1));

    }

}
