package com.interview.exercises.leetcode.bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleNumberTest {

    @Test
    public void singleNumber_test() {

        SingleNumber singleNumber = new SingleNumber();

        assertThat(singleNumber.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
        assertThat(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
        assertThat(singleNumber.singleNumber(new int[]{1})).isEqualTo(1);

    }

}
