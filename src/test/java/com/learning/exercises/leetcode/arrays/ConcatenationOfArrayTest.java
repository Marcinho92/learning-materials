package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConcatenationOfArrayTest {

    @Test
    public void concatenationOfArray_test() {

        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

        assertThat(concatenationOfArray.getConcatenation(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 3, 1, 2, 3});

    }

}
