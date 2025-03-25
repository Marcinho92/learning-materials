package com.learning.exercises.leetcode.arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
//        Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//        Note that the five elements can be returned in any order.
//                It does not matter what you leave beyond the returned k (hence they are underscores).

        if (nums == null) return 0;
        if (nums.length == 1) {
            if (nums[0] == val) {
                nums[0] = val - 1;
                return 0;
            } else {
                return 1;
            }
        }

        int left = 0, right = 1;

        while (right < nums.length) {
            while (left < nums.length && nums[left] != val) {
                ++left;
                ++right;
            }

            while (right < nums.length && nums[right] == val) {
                ++right;
            }
            if (right >= nums.length) {
                return left;
            }

            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            ++left;
            right = left + 1;
        }

        return left;
    }

}
