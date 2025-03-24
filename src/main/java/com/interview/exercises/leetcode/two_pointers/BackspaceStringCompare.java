package com.interview.exercises.leetcode.two_pointers;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
//        Input: s = "ab#c", t = "ad#c"
//        Output: true
//        Explanation: Both s and t become "ac".

        int p1 = s.length() - 1, p2 = t.length() - 1;
        while (p1 > -1 || p2 > -1) {
            p1 = getIndex(s, p1);
            p2 = getIndex(t, p2);

            if (p1 < 0 && p2 < 0) {
                return true;
            } else if (p1 < 0 || p2 < 0 || s.charAt(p1) != t.charAt(p2)) {
                return false;
            }

            --p1;
            --p2;
        }


        return true;
    }

    private int getIndex(String s, int p1) {
        int back1 = 0;
        while (p1 > -1 && (s.charAt(p1) == '#' || back1 > 0)) {
            if (s.charAt(p1) == '#') {
                ++back1;
            } else {
                --back1;
            }
            --p1;
        }
        return p1;
    }

}
