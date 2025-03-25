package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseIntegerTest {

    @Test
    public void reverseInteger_test() {
        ReverseInteger reverseInteger = new ReverseInteger();

        int result = reverseInteger.reverse(-123);
        int result2 = reverseInteger.reverse(1200);
        int result3 = reverseInteger.reverse(-12300);
        int result4 = reverseInteger.reverse(1534236469);

        assertThat(result).isEqualTo(-321);
        assertThat(result2).isEqualTo(21);
        assertThat(result3).isEqualTo(-321);
        assertThat(result4).isEqualTo(0);

    }

}