package com.learning.exercises.leetcode.two_pointers;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r

        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;
        while (p1 < word1.length() && p2 < word2.length()) {
            sb.append(word1.charAt(p1)).append(word2.charAt(p2));
            ++p1;
            ++p2;
        }

        if (p1 < word1.length()) {
            sb.append(word1.substring(p1));
        } else if (p2 < word2.length()) {
            sb.append(word2.substring(p2));
        }

        return sb.toString();
    }

}
