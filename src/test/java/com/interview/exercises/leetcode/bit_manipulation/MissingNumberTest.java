package com.interview.exercises.leetcode.bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MissingNumberTest {

    @Test
    public void missingNumber_test() {

        MissingNumber missingNumber = new MissingNumber();

        assertThat(missingNumber.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
        assertThat(missingNumber.missingNumber(new int[]{0, 1})).isEqualTo(2);
        assertThat(missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
        assertThat(missingNumber.missingNumber(new int[]{2, 0})).isEqualTo(1);

    }

}
