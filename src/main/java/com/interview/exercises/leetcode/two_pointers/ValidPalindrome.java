package com.interview.exercises.leetcode.two_pointers;

import java.util.Set;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;

        Set<Character> chars = Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3');

        String str = s.toLowerCase();
        int n = str.length();
        int left = 0, right = n - 1;

        while (left < right) {
            while (left < n && (str.charAt(left) < 'a' || str.charAt(left) > 'z')) ++left;
            while (right >= 0 && (str.charAt(right) < 'a' || str.charAt(right) > 'z')) --right;

            if (left == n || right < 0) return true;
            if (str.charAt(left) != str.charAt(right)) return false;

            ++left;
            --right;
        }

        return true;
    }

}