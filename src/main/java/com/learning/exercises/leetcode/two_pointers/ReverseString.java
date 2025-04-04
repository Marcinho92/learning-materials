package com.learning.exercises.leetcode.two_pointers;

public class ReverseString {

    public char[] reverseString(char[] s) {
        int n = s.length;
        char tmp;
        for (int i = 0; i < n / 2; ++i) {
            tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }

        return s;
    }

}