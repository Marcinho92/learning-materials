package com.learning.exercises.leetcode.arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int res = 0, count = 0;

        for (int num : nums) {
            if (count == 0) res = num;

            if (num == res) ++count;
            else --count;
        }

        return res;

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int num: nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, 1);
//            } else {
//                map.put(num, map.get(num) + 1);
//            }
//        }
//
//        Integer majorityElement = map.entrySet().stream()
//                .max(Map.Entry.comparingByValue()).get().getKey();
//
//        return majorityElement;
    }

}
