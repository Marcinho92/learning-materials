package com.learning.exercises.leetcode.two_pointers;

public class ValidPalindrome2 {

    public boolean validPalindrome(String s) {
//        Input: s = "abca"
//        Output: true

        int n = s.length();
        int left = 0, right = n - 1;
        int diffs = 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (diffs > 0) {
                    if (s.charAt(left + 1) == s.charAt(right)) {
                        ++left;
                        --diffs;
                    } else if (s.charAt(left) == s.charAt(right - 1)) {
                        --right;
                        --diffs;
                    } else {
                        return false;
                    }
                } else {
                    left = 0; right = n - 1;
                    diffs = 1;
                    while (left < right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            if (diffs > 0) {
                                if (s.charAt(left) == s.charAt(right - 1)) {
                                    --right;
                                    --diffs;
                                } else if (s.charAt(left + 1) == s.charAt(right)) {
                                    ++left;
                                    --diffs;
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                        ++left;
                        --right;
                    }
                }
            }
            ++left;
            --right;
        }

        return true;
    }


}
