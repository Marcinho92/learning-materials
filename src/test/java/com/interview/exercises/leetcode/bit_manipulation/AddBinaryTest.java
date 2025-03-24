package com.interview.exercises.leetcode.bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBinaryTest {

    @Test
    public void addBinary_test() {

        AddBinary addBinary = new AddBinary();

        assertThat(addBinary.addBinary("11", "1")).isEqualTo("100");
        assertThat(addBinary.addBinary("1010", "1011")).isEqualTo("10101");
        assertThat(addBinary.addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"))
                .isEqualTo("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000");

    }

}
