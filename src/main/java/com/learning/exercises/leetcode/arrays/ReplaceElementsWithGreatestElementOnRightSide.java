package com.learning.exercises.leetcode.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        if (n == 1) return new int[]{-1};
        if (n == 2) return new int[]{arr[1], -1};

        int max = arr[n - 1];
        arr[n - 1] = -1;
        int tmpMax;

        for (int i = n - 2; i >= 0; --i) {
            tmpMax = Math.max(max, arr[i]);
            arr[i] = max;
            max = tmpMax;
        }

        return arr;
    }

}
