package com.interview.exercises.leetcode.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Input: nums = [1,2,3,1], k = 3
//        Output: true

        int n = nums.length;
        if (n < 2) {
            return false;
        }

        int left = 0, right;
        Set<Integer> set = new HashSet<>();
        set.add(nums[left]);
        for (right = 1; right < Math.min(k + 1, n); ++right) {
            if (set.contains(nums[right])) {
                return true;
            } else {
                set.add(nums[right]);
            }
        }

        set.remove(nums[left]);
        ++left;
        while (right < n) {
            if (set.contains(nums[right])) {
                return true;
            } else {
                set.add(nums[right]);
            }

            set.remove(nums[left]);
            ++left;
            ++right;
        }

        return false;
    }

}
