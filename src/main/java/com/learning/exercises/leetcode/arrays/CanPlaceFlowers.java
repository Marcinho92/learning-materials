package com.learning.exercises.leetcode.arrays;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        Example 1:
//
//        Input: flowerbed = [1,0,0,0,1], n = 1
//        Output: true
//        Example 2:
//
//        Input: flowerbed = [1,0,0,0,1], n = 2
//        Output: false


        int[] newFlowerBed = new int[flowerbed.length + 2];
        newFlowerBed[0] = 0;
        newFlowerBed[newFlowerBed.length - 1] = 0;
        System.arraycopy(flowerbed, 0, newFlowerBed, 1, flowerbed.length);

        for (int i = 1; i < newFlowerBed.length - 1; ++i) {
            if (newFlowerBed[i - 1] == 0 & newFlowerBed[i] == 0 && newFlowerBed[i + 1] == 0) {
                newFlowerBed[i] = 1;
                --n;
            }
        }

        return n < 1;
    }

}
