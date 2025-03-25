package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RedistributeCharactersMakeAllStringsEqualTest {

    @Test
    public void singleThreadedCPU_test() {

        RedistributeCharactersMakeAllStringsEqual redistributeCharactersMakeAllStringsEqual = new RedistributeCharactersMakeAllStringsEqual();

        assertThat(redistributeCharactersMakeAllStringsEqual.makeEqual(new String[]{"abc", "aabc", "bc"})).isTrue();
        assertThat(redistributeCharactersMakeAllStringsEqual.makeEqual(new String[]{"ab", "a"})).isFalse();

    }

}