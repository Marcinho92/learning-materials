package com.interview.exercises.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrangingCoinsTest {

    @Test
    public void arrangingCoins_test() {

        ArrangingCoins arrangingCoins = new ArrangingCoins();

        assertThat(arrangingCoins.arrangeCoins(5)).isEqualTo(2);
        assertThat(arrangingCoins.arrangeCoins(8)).isEqualTo(3);
        assertThat(arrangingCoins.arrangeCoins(2)).isEqualTo(1);
        assertThat(arrangingCoins.arrangeCoins(9)).isEqualTo(3);
        assertThat(arrangingCoins.arrangeCoins(10)).isEqualTo(4);

    }

}
