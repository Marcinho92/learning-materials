package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStringTest {

    @Test
    public void reverseString_test() {

        ReverseString reverseString = new ReverseString();

        assertThat(reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'})).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'h'});

    }

}