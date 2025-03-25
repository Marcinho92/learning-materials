package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidPalindrome2Test {

    @Test
    public void validPalindrome2_test() {

        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();

        assertThat(validPalindrome2.validPalindrome("aba")).isTrue();
        assertThat(validPalindrome2.validPalindrome("abca")).isTrue();
        assertThat(validPalindrome2.validPalindrome("abc")).isFalse();
        assertThat(validPalindrome2.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")).isTrue();

    }

}
