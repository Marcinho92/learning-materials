package com.interview.exercises.leetcode.two_pointers;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//        Output: true
//        Explanation:
//        word1 represents string "ab" + "c" -> "abc"
//        word2 represents string "a" + "bc" -> "abc"
//        The strings are the same, so return true.

        StringBuilder sb1 = new StringBuilder();
        for (String word: word1) {
            sb1.append(word);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String word: word2) {
            sb2.append(word);
        }

        return sb1.toString().equals(sb2.toString());
    }

}
