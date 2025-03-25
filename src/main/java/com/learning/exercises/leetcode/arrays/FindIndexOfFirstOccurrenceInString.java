package com.learning.exercises.leetcode.arrays;

public class FindIndexOfFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
//        Explanation: "sad" occurs at index 0 and 6.
//        The first occurrence is at index 0, so we return 0.

        int n1 = haystack.length();
        int n2 = needle.length();
        if (n1 < n2) {
            return -1;
        }

        for (int i = 0; i <= n1 - n2; ++i) {
            int j = 0;
            for (; j < n2; ++j) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == n2) {
                return i;
            }

        }

        return -1;
    }

}
