package com.interview.exercises.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//        Output: [-1,3,-1]
//        Explanation: The next greater element for each value of nums1 is as follows:
//        - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//                - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//                - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

        //[ 2, 1, 3, 4 ]
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; ++i) {
            map.put(nums1[i], i);
        }

        Stack<Integer> stack = new Stack<>();
        for (int cur : nums2) {
            while (!stack.isEmpty() && cur > stack.peek()) {
                Integer popped = stack.pop();
                Integer index = map.get(popped);
                ans[index] = cur;
            }

            if (map.containsKey(cur)) {
                stack.push(cur);
            }
        }

        return ans;

//        int[] ans = new int[nums1.length];
//
//        for (int i = 0; i < nums1.length; ++i) {
//            int nextGreater = -1;
//            boolean found = false;
//            for (int j = 0; j < nums2.length; ++j) {
//                if (found && nums1[i] != nums2[j]) {
//                    if (nums2[j] > nums1[i]) {
//                        nextGreater = nums2[j];
//                        break;
//                    }
//                } else if (nums1[i] == nums2[j]) {
//                    found = true;
//                }
//            }
//            ans[i] = nextGreater;
//        }
//
//        return ans;
    }

}
