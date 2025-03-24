package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstUniqueCharacterTest {

    @Test
    public void firstUniqueCharacter_test() {

        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

        int result = firstUniqueCharacter.firstUniqChar("leetcode");

        assertThat(result).isEqualTo(0);

    }

}
