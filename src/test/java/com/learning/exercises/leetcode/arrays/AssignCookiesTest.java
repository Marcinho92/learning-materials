package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssignCookiesTest {

    @Test
    public void assignCookies_test() {

        AssignCookies assignCookies = new AssignCookies();

        assertThat(assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1, 1})).isEqualTo(1);

    }

}
