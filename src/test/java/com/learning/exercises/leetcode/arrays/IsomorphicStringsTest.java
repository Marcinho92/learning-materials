package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsomorphicStringsTest {

    @Test
    public void singleThreadedCPU_test() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        assertThat(isomorphicStrings.isIsomorphic("egg", "add")).isTrue();
        assertThat(isomorphicStrings.isIsomorphic("foo", "bar")).isFalse();
        assertThat(isomorphicStrings.isIsomorphic("paper", "title")).isTrue();
        assertThat(isomorphicStrings.isIsomorphic("badc", "baba")).isFalse();

    }

}