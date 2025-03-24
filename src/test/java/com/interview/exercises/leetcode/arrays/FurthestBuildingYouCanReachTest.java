package com.interview.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FurthestBuildingYouCanReachTest {

    @Test
    public void furthestBuildingYouCanReach_test() {

        FurthestBuildingYouCanReach furthestBuildingYouCanReach = new FurthestBuildingYouCanReach();

//        assertThat(furthestBuildingYouCanReach.furthestBuilding(new int[] {4,2,7,6,9,14,12}, 5, 1)).isEqualTo(4);
        assertThat(furthestBuildingYouCanReach.furthestBuilding(new int[] {4,12,2,7,3,18,20,3,19}, 10, 2)).isEqualTo(7);

    }

}
