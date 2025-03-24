package com.interview.exercises.leetcode.arrays;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
//        Input: s = "abc", t = "ahbgdc"
//        Output: true

        int sLen = s.length();
        int tLen = t.length();
        if (sLen > tLen) return false;

        int sCurr = 0, tCurr = 0;
        while (sCurr < sLen && tCurr < tLen) {
            if (s.charAt(sCurr) == t.charAt(tCurr)) {
                ++sCurr;
                ++tCurr;
            } else {
                ++tCurr;
            }
        }

        return sCurr == sLen;
    }

}
