package com.interview.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackspaceStringCompareTest {

    @Test
    public void backspaceStringCompare_test() {

        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

        assertThat(backspaceStringCompare.backspaceCompare("ab#c", "ad#c")).isTrue();
        assertThat(backspaceStringCompare.backspaceCompare("ab##", "c#d#")).isTrue();
        assertThat(backspaceStringCompare.backspaceCompare("a#c", "b")).isFalse();
        assertThat(backspaceStringCompare.backspaceCompare("xywrrmp", "xywrrmu#p")).isTrue();
        assertThat(backspaceStringCompare.backspaceCompare("nzp#o#g", "b#nzp#o#g")).isTrue();

    }

}
