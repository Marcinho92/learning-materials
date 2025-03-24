package com.interview.exercises.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]

        Set<Integer> set1 = new HashSet();
        for (int num: nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet();
        for (int num: nums2) {
            set2.add(num);
        }


        set1.removeIf(next -> !set2.contains(next));

        return set1.stream().mapToInt(Integer::intValue).toArray();
    }

}
