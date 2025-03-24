package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeStringsAlternatelyTest {

    @Test
    public void mergeStringsAlternately_test() {

        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

        assertThat(mergeStringsAlternately.mergeAlternately("abc", "pqr")).isEqualTo("apbqcr");
        assertThat(mergeStringsAlternately.mergeAlternately("ab", "pqrs")).isEqualTo("apbqrs");
        assertThat(mergeStringsAlternately.mergeAlternately("abcd", "pq")).isEqualTo("apbqcd");

    }

}
