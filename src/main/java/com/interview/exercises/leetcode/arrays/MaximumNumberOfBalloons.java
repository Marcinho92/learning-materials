package com.interview.exercises.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> chars = new HashMap<>();

        for (Character c: text.toCharArray()) {
            if (!chars.containsKey(c)) {
                chars.put(c, 1);
            } else {
                chars.put(c, chars.get(c) + 1);
            }
        }

        int count = chars.getOrDefault('b', 0);
        count = Math.min(count, chars.getOrDefault('a', 0));
        count = Math.min(count, chars.getOrDefault('n', 0));
        count = Math.min(count, chars.getOrDefault('l', 0) / 2);
        count = Math.min(count, chars.getOrDefault('o', 0) / 2);

        return count;
    }

}
