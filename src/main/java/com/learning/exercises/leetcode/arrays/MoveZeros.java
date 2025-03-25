package com.learning.exercises.leetcode.arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

//        moveZeroes(new int[]{0, 0, 0, 0, 0});
//        moveZeroes(new int[]{0});
        moveZeroes(new int[]{0, 1});
//        moveZeroes(new int[]{0, 1, 0, 3, 12});

    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        int n = nums.length;

        int slow = 0, fast = 1;
        while (fast < n) {
            if (nums[slow] == 0) {
                while (fast < n - 1 && nums[fast] == 0) {
                    ++fast;
                }

                if (fast == n - 1 && nums[fast] == 0) {
                    System.out.println(Arrays.toString(nums));
                    return;
                } else {
                    int tmp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast] = tmp;
                }

            }
            ++slow;
            fast = slow + 1;
        }

        System.out.println(Arrays.toString(nums));
    }

}