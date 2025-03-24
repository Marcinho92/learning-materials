package com.interview.exercises.leetcode.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int i = 0;
        for (; i < heights.length - 1; ++i) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                bricks -= diff;
                maxHeap.add(diff);

                if (bricks < 0) {
                    if (ladders == 0) {
                        return i;
                    }

                    --ladders;
                    Integer poll = maxHeap.poll();
                    bricks += poll != null ? poll : 0;
                }
            }
        }

        return heights.length - 1;
    }

}
