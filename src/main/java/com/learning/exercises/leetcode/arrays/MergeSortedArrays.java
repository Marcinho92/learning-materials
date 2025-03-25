package com.learning.exercises.leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
//        merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            System.out.println(Arrays.toString(nums1));
            return;
        }

        int end = n + m - 1;
        --m; --n;
        while (end >= 0) {
            if (n == -1 || (m != -1 && nums1[m] >= nums2[n])) {
                nums1[end] = nums1[m--];
            } else {
                nums1[end] = nums2[n--];
            }
            --end;
        }

        System.out.println(Arrays.toString(nums1));
    }

}