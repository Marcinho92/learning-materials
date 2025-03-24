package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindIndexOfFirstOccurrenceInStringTest {

    @Test
    public void singleThreadedCPU_test() {

        FindIndexOfFirstOccurrenceInString findIndexOfFirstOccurrenceInString = new FindIndexOfFirstOccurrenceInString();

        assertThat(findIndexOfFirstOccurrenceInString.strStr("a", "a")).isEqualTo(0);
        assertThat(findIndexOfFirstOccurrenceInString.strStr("sadbutsad", "sad")).isEqualTo(0);
        assertThat(findIndexOfFirstOccurrenceInString.strStr("aasadbutsad", "sad")).isEqualTo(2);
        assertThat(findIndexOfFirstOccurrenceInString.strStr("leetcode", "leeto")).isEqualTo(-1);
        assertThat(findIndexOfFirstOccurrenceInString.strStr("leetcode", "demo")).isEqualTo(-1);

    }

}