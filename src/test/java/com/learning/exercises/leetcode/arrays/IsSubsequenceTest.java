package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsSubsequenceTest {

    @Test
    public void singleThreadedCPU_test() {

        IsSubsequence isSubsequence = new IsSubsequence();

        assertThat(isSubsequence.isSubsequence("abc", "ahbgdc")).isTrue();
        assertThat(isSubsequence.isSubsequence("axc", "ahbgdc")).isFalse();

    }

}