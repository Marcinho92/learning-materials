package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestCommonPrefixTest {

    @Test
    public void singleThreadedCPU_test() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"})).isEqualTo("fl");
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"dog","racecar","car"})).isEqualTo("");

    }

}