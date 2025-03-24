package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfLastWordTest {

    @Test
    public void singleThreadedCPU_test() {

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        assertThat(lengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
        assertThat(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);

    }

}