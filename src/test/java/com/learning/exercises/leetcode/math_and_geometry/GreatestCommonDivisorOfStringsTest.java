package com.learning.exercises.leetcode.math_and_geometry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatestCommonDivisorOfStringsTest {

    @Test
    public void gcdOfStrings_test() {
        GreatestCommonDivisorOfStrings gcds = new GreatestCommonDivisorOfStrings();

        assertThat(gcds.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"))
                .isEqualTo("TAUXX");
        assertThat(gcds.gcdOfStrings("ABCABC", "ABC")).isEqualTo("ABC");
        assertThat(gcds.gcdOfStrings("ABABAB", "AB")).isEqualTo("AB");
        assertThat(gcds.gcdOfStrings("ABABAB", "ABAB")).isEqualTo("AB");
        assertThat(gcds.gcdOfStrings("ABABABAB", "ABAB")).isEqualTo("ABAB");
        assertThat(gcds.gcdOfStrings("AAAAAAAAA", "AAACCC")).isEqualTo("");
        assertThat(gcds.gcdOfStrings("LEET", "CODE")).isEqualTo("");
    }

}
