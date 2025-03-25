package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveKdigitsTest {

    @Test
    public void removeKdigits_test() {
        RemoveKdigits removeKdigits = new RemoveKdigits();

//        String result = removeKdigits.removeKdigits("1432219", 3);
//        String result2 = removeKdigits.removeKdigits("10200", 1);
//        String result3 = removeKdigits.removeKdigits("10", 1);
//        String result3 = removeKdigits.removeKdigits("10200", 1);
//        String result4 = removeKdigits.removeKdigits("9", 1);
        String result5 = removeKdigits.removeKdigits("1234567890", 9);
//        String result6 = removeKdigits.removeKdigits("112", 1);

//        assertThat(result).isEqualTo("1219");
//        assertThat(result2).isEqualTo("200");
//        assertThat(result3).isEqualTo("0");
//        assertThat(result3).isEqualTo("200");
//        assertThat(result4).isEqualTo("0");
        assertThat(result5).isEqualTo("0");
//        assertThat(result6).isEqualTo("11");

    }

}