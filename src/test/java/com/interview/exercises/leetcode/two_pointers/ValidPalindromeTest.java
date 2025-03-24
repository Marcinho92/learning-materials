package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidPalindromeTest {

    @Test
    public void validPalindrome_test() {
        ValidPalindrome palindrome = new ValidPalindrome();

//        boolean result1 = palindrome.isPalindrome("kajak");
//        boolean result2 = palindrome.isPalindrome("A man, a plan, a canal: Panama");
//        boolean result3 = palindrome.isPalindrome("race a car");
        boolean result4 = palindrome.isPalindrome("0P");

//        assertThat(result1).isTrue();
//        assertThat(result2).isTrue();
//        assertThat(result3).isFalse();
        assertThat(result4).isTrue();

    }

}