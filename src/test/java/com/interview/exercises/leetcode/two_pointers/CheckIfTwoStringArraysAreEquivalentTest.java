package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void firstUniqueCharacter_test() {

        CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();

        assertThat(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})).isTrue();
        assertThat(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})).isFalse();
        assertThat(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"})).isTrue();

    }

}
