package com.learning.exercises.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDiffBetweenHighestAndLowestOfKScoresTest {

    @Test
    public void minDiffBetweenHighestAndLowestOfKScores_test() {

        MinDiffBetweenHighestAndLowestOfKScores minDiffBetweenHighestAndLowestOfKScores = new MinDiffBetweenHighestAndLowestOfKScores();

        assertThat(minDiffBetweenHighestAndLowestOfKScores.minimumDifference(new int[]{90}, 1)).isEqualTo(0);
        assertThat(minDiffBetweenHighestAndLowestOfKScores.minimumDifference(new int[]{9, 4, 1, 7}, 2)).isEqualTo(2);
        assertThat(minDiffBetweenHighestAndLowestOfKScores.minimumDifference(new int[]{87063, 61094, 44530, 21297, 95857, 93551, 9918}, 6)).isEqualTo(74560);

    }

}
