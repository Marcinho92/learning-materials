package com.learning.exercises.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
//        Input: s = "egg", t = "add"
//        Output: true
//        Explanation:
//        The strings s and t can be made identical by:
//        Mapping 'e' to 'a'.
//        Mapping 'g' to 'd'.

        if (s.length() != t.length()) return false;

        Map<Character, Character> mappings = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (!mappings.containsKey(s.charAt(i))) {
                if (mappings.containsValue(t.charAt(i))) {
                    return false;
                }
                mappings.put(s.charAt(i), t.charAt(i));
            } else if (mappings.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
