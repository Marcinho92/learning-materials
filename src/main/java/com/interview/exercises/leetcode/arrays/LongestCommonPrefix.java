package com.interview.exercises.leetcode.arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"

        if (strs == null) return "";
        if (strs.length == 1) return strs[0];

        String result = strs[0];
        for (String str: strs) {
            int len = Math.min(result.length(), str.length());
            for (int i = 0; i < len; ++i) {
                if (result.charAt(i) != str.charAt(i)) {
                    len = i;
                    break;
                }
            }
            result = str.substring(0, len);
        }

        return result;
    }

}
