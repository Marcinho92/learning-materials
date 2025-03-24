package com.interview.exercises.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidPerfectSquareTest {

    @Test
    public void validPerfectSquare_test() {

        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

        assertThat(validPerfectSquare.isPerfectSquare(16)).isTrue();
        assertThat(validPerfectSquare.isPerfectSquare(14)).isFalse();
        assertThat(validPerfectSquare.isPerfectSquare(4)).isTrue();
        assertThat(validPerfectSquare.isPerfectSquare(808201)).isTrue();

    }

}
